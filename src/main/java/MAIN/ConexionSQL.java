package MAIN;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class ConexionSQL {

       String usuario = "usuarioSQL";
       String contrasenia = "root";
       String BD = "TrabajadoresPrueba";
       String ip = "localhost";
       String puerto = "1433";
       Connection conectar = null;
         
       String CadenaConexion = "jdbc:sqlserver://"+ip+":"+puerto+"/"+BD;
       
       public Connection establecerConexion(){
           try {
              String cadena = "jdbc:sqlserver://localhost:"+puerto+";"+"databaseName="+BD;
               conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
               //JOptionPane.showMessageDialog(null, "Conectado !");
               
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Error al conectar la base de datos \n"+e.toString());
           }
           return conectar;
       }     
       public int tamTabla(String tabla) throws SQLException{
           establecerConexion();
           Statement st = conectar.createStatement();
           ResultSet rs = st.executeQuery("select count(*) from "+tabla);
           int tam = 0;
           while(rs.next()){
                tam = rs.getInt(1);
           }
          conectar.close();
          return tam;         
       }
       public void llenarCmb(JComboBox cmb, String tabla) throws SQLException{
           establecerConexion();
           Statement st = conectar.createStatement();
           ResultSet rs = st.executeQuery("select * from "+tabla);
           int cont = 0 ;
           String[] arr = new String[tamTabla(tabla)] ;
            
           while(rs.next()){
               if(tabla == "dbo.Departamento"){
                   arr[cont] = rs.getString(2);                          
               }else{
                   arr[cont] = rs.getString(3);  
               }
              cont++; 
           }
            cmb.setModel(new javax.swing.DefaultComboBoxModel<>(arr));
            conectar.close();
       }

       public void llenarTable(JTable tbl){
           establecerConexion();
            try {                 
                    String sql = "SELECT * FROM dbo.Trabajadores ";

                    @SuppressWarnings("serial")
                    DefaultTableModel model = new DefaultTableModel() {
                            public boolean isCellEditable(int filas, int columnas) {
                                    if(columnas==8) {
                                            return true;
                                    }
                                    else {
                                            return false;
                                    }
                            }
                    };
                    model.addColumn("ID");
                    model.addColumn("Tipo Documento ");
                    model.addColumn("Número");
                    model.addColumn("Nombres");
                    model.addColumn("Sexo");
                    model.addColumn("Departamento");
                    model.addColumn("Provincia");
                    model.addColumn("Distrito");
                    tbl.setModel(model);

                    Object[] dato = new Object[8];

                    Statement statement = conectar.createStatement();
                    ResultSet result = statement.executeQuery(sql);

                    while(result.next()) {   
                            dato[0]=String.valueOf(result.getInt(1));
                            dato[1]=result.getString(2);
                            dato[2]=result.getString(3);
                            dato[3]=result.getString(4);
                            dato[4]=result.getString(5);
                            dato[5]=String.valueOf(result.getInt(6));
                            dato[6]=String.valueOf(result.getInt(7));
                            dato[7]=String.valueOf(result.getInt(8));
                           
                            model.addRow(dato);
                    }
                    
             conectar.close();
             
            }catch(SQLException ex) {	
                    ex.printStackTrace();
            }
    
       }
       public int generarID() throws SQLException{
           
           int id = -1;
           if(tamTabla("dbo.Trabajadores") > 0){
            establecerConexion();
            Statement st = conectar.createStatement();
            ResultSet rs = st.executeQuery("select MAX(id) from dbo.Trabajadores");
            while(rs.next()){
                 id = rs.getInt(1);
            }
           }else{
               id = 0;
           }
           
           return id + 1;
       }
       public void agregarTrabajador( int idDepa, int idDistrito, int idProvincia, String nom,
                                    String numDoc, String sex, String tipoDocum) {
		try {
                    establecerConexion();
			String sql = "SET IDENTITY_INSERT [dbo].[Trabajadores] ON\n"
                                + "INSERT INTO dbo.Trabajadores (Id,IdDepartamento,IdDistrito,IdProvincia,Nombres,NumDocumento,Sexo,TipoDocumento)"
					+ "VALUES(?,?,?,?,?,?,?,?)\n"
                                + "SET IDENTITY_INSERT [dbo].[Trabajadores] OFF";
			
			PreparedStatement statement = conectar.prepareStatement(sql);
			
			statement.setInt(1, generarID());
			statement.setInt(2, idDepa);
			statement.setInt(3, idDistrito);
			statement.setInt(4, idProvincia);
			statement.setString(5, nom);
                        statement.setString(6, numDoc);
                        statement.setString(7, sex);
			statement.setString(8, tipoDocum);
                        
			statement.executeUpdate();
                        
                        JOptionPane.showMessageDialog(null, "TRABAJADOR AGREGADO SATISFACTORIAMENTE");
			conectar.close();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error al ingresar los datos","ERROR",JOptionPane.ERROR_MESSAGE);
		}
	}
       
       public int idDistrito(String distrito){
          establecerConexion();
          int id = 0;
           Statement st;
           try {
               st = conectar.createStatement();
               ResultSet rs = st.executeQuery("select id from dbo.Distrito where NombreDistrito = '"+distrito+"'" );
               
           while(rs.next()){
               id = rs.getInt(1);

           }
                       
            conectar.close();
            
           } catch (SQLException ex) {
               Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
           }
           return id;
       }
       public void llenarDatos(int id, JComboBox cmbDocumento, JTextField ndoc, JTextField nom,
                                JComboBox cmbDepa, JComboBox cmbProvi, JComboBox Distrito, JRadioButton bF, JRadioButton bM){
          establecerConexion();
           Statement st;
           try {
               st = conectar.createStatement();
               ResultSet rs = st.executeQuery("select * from dbo.Trabajadores where id = "+id);          
           while(rs.next()){
               cmbDocumento.setSelectedItem(rs.getString(2));
               ndoc.setText(rs.getString(3));
               nom.setText(rs.getString(4));             
               cmbDepa.setSelectedIndex(rs.getInt(6));
               cmbProvi.setSelectedIndex(rs.getInt(7));
               Distrito.setSelectedIndex(rs.getInt(8) - 1857);
               
               //BUTTON GROUP F O M
               if(rs.getString(5).equals("F")){
                   bF.setSelected(true);
               }else{
               bM.setSelected(true);
               }              
           }
                       
            conectar.close();
            
           } catch (SQLException ex) {
               Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       public void modificarDatos(int id,int idDepa, int idDistri, int idProv, String nom, String numDoc, String sex, String tipoD){
           establecerConexion();
           try {
               String sql = "update dbo.Trabajadores set IdDepartamento ="+idDepa+", IdDistrito ="+idDistri+", "
                       + "IdProvincia = "+idProv+", Nombres = '"+nom+"', NumDocumento = '"+numDoc+"', "
                       + "Sexo = '"+sex+"', TipoDocumento = '"+tipoD+"' where id = "+id ;      
               
               PreparedStatement pps = conectar.prepareStatement(sql);
			pps.executeUpdate();
            
           
            conectar.close();
            
           } catch (SQLException ex) {
                ex.printStackTrace();
               JOptionPane.showMessageDialog(null, "Error al modificar datos","ERROR",JOptionPane.ERROR_MESSAGE);
           }
       }
       public void eliminarDatos(int id){
           establecerConexion();
           try {
               String sql = "delete from dbo.Trabajadores where id = "+id;      
               
              PreparedStatement pps = conectar.prepareStatement(sql);
              pps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "ELIMINADO CORRECTAMENTE");
            conectar.close();
            
           } catch (SQLException ex) {
               ex.printStackTrace();
               JOptionPane.showMessageDialog(null, "Error al eliminar los datos","ERROR",JOptionPane.ERROR_MESSAGE);
           }
                          
       }         
}
