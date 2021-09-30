/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MAIN;

import java.awt.Point;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class GUI_Prueba extends javax.swing.JFrame {
    ConexionSQL conex = new ConexionSQL();
    public GUI_Prueba() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            conex.llenarCmb(cmbDepartamento,"dbo.Departamento");
            conex.llenarCmb(cmbDistrito,"dbo.Distrito");
            conex.llenarCmb(cmbProvincia,"dbo.Provincia  ");
            conex.llenarTable(tblTrabajadores);
        } catch (SQLException ex) {
            Logger.getLogger(GUI_Prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlLeft = new javax.swing.JPanel();
        btnDatosP1 = new javax.swing.JButton();
        btnListaTrab1 = new javax.swing.JButton();
        iconoUser = new javax.swing.JLabel();
        pnlDerecha = new javax.swing.JPanel();
        pnlDatosPersonales = new javax.swing.JPanel();
        lblPanelDatosP = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnReporte = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblNDocum = new javax.swing.JLabel();
        cmbDistrito = new javax.swing.JComboBox<>();
        lblDep = new javax.swing.JLabel();
        txtNomCom = new javax.swing.JTextField();
        lblTipoD = new javax.swing.JLabel();
        txtNumDoc = new javax.swing.JTextField();
        lblNC = new javax.swing.JLabel();
        jrdbtnFeme = new javax.swing.JRadioButton();
        jrdbtnMasc = new javax.swing.JRadioButton();
        lblSex = new javax.swing.JLabel();
        lblDistri = new javax.swing.JLabel();
        lblProv = new javax.swing.JLabel();
        cmbTipoDocumento1 = new javax.swing.JComboBox<>();
        cmbDepartamento = new javax.swing.JComboBox<>();
        cmbProvincia = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        pnlListaTrab = new javax.swing.JPanel();
        lblListaT = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTrabajadores = new javax.swing.JTable();
        btnRecargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TRABAJADORES");
        setBackground(new java.awt.Color(153, 0, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLeft.setBackground(new java.awt.Color(177, 88, 88));
        pnlLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDatosP1.setBackground(new java.awt.Color(247, 120, 27));
        btnDatosP1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btnDatosP1.setText("Datos personales");
        btnDatosP1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDatosP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDatosP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosP1ActionPerformed(evt);
            }
        });
        pnlLeft.add(btnDatosP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 210, 70));

        btnListaTrab1.setBackground(new java.awt.Color(247, 120, 27));
        btnListaTrab1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btnListaTrab1.setText("Lista de trabajadores");
        btnListaTrab1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnListaTrab1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListaTrab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaTrab1ActionPerformed(evt);
            }
        });
        pnlLeft.add(btnListaTrab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 210, 70));

        iconoUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Escritorio\\ICONOS\\icons8-user-100.png")); // NOI18N
        pnlLeft.add(iconoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 100, 100));

        getContentPane().add(pnlLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 580));

        pnlDerecha.setBackground(new java.awt.Color(0, 51, 102));
        pnlDerecha.setLayout(new java.awt.CardLayout());

        pnlDatosPersonales.setBackground(new java.awt.Color(0, 51, 102));
        pnlDatosPersonales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPanelDatosP.setFont(new java.awt.Font("Unispace", 0, 36)); // NOI18N
        lblPanelDatosP.setForeground(new java.awt.Color(255, 255, 255));
        lblPanelDatosP.setText("DATOS PERSONALES");
        pnlDatosPersonales.add(lblPanelDatosP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(177, 88, 88));
        jSeparator1.setForeground(new java.awt.Color(177, 88, 88));
        pnlDatosPersonales.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 78, 660, -1));

        btnReporte.setBackground(new java.awt.Color(247, 120, 27));
        btnReporte.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReporte.setText("Reporte");
        btnReporte.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlDatosPersonales.add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 140, 50));

        btnAgregar.setBackground(new java.awt.Color(247, 120, 27));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        pnlDatosPersonales.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 140, 50));

        btnActualizar.setBackground(new java.awt.Color(247, 120, 27));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        pnlDatosPersonales.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 140, 50));

        btnEliminar.setBackground(new java.awt.Color(247, 120, 27));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pnlDatosPersonales.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 140, 50));

        lblNDocum.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblNDocum.setForeground(new java.awt.Color(255, 255, 255));
        lblNDocum.setText("N° de documento:");
        pnlDatosPersonales.add(lblNDocum, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 160, 40));
        pnlDatosPersonales.add(cmbDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 350, 30));

        lblDep.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblDep.setForeground(new java.awt.Color(255, 255, 255));
        lblDep.setText("Departamento:");
        pnlDatosPersonales.add(lblDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 140, 40));
        pnlDatosPersonales.add(txtNomCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 370, 30));

        lblTipoD.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblTipoD.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoD.setText("Tipo de documento:");
        pnlDatosPersonales.add(lblTipoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 180, 40));
        pnlDatosPersonales.add(txtNumDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 190, 30));

        lblNC.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblNC.setForeground(new java.awt.Color(255, 255, 255));
        lblNC.setText("Nombre completo:");
        pnlDatosPersonales.add(lblNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 160, 40));

        jrdbtnFeme.setBackground(new java.awt.Color(0, 51, 102));
        buttonGroup1.add(jrdbtnFeme);
        jrdbtnFeme.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jrdbtnFeme.setForeground(new java.awt.Color(255, 255, 255));
        jrdbtnFeme.setText("Femenino");
        pnlDatosPersonales.add(jrdbtnFeme, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        jrdbtnMasc.setBackground(new java.awt.Color(0, 51, 102));
        buttonGroup1.add(jrdbtnMasc);
        jrdbtnMasc.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jrdbtnMasc.setForeground(new java.awt.Color(255, 255, 255));
        jrdbtnMasc.setText("Masculino");
        pnlDatosPersonales.add(jrdbtnMasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        lblSex.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblSex.setForeground(new java.awt.Color(255, 255, 255));
        lblSex.setText("Sexo:");
        pnlDatosPersonales.add(lblSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 50, 40));

        lblDistri.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblDistri.setForeground(new java.awt.Color(255, 255, 255));
        lblDistri.setText("Distrito:");
        pnlDatosPersonales.add(lblDistri, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 140, 40));

        lblProv.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblProv.setForeground(new java.awt.Color(255, 255, 255));
        lblProv.setText("Provincia:");
        pnlDatosPersonales.add(lblProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 140, 40));

        cmbTipoDocumento1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "CEX", "PAS" }));
        pnlDatosPersonales.add(cmbTipoDocumento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 70, 30));

        pnlDatosPersonales.add(cmbDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 350, 30));

        pnlDatosPersonales.add(cmbProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 350, 30));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        pnlDatosPersonales.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        pnlDerecha.add(pnlDatosPersonales, "card2");

        pnlListaTrab.setBackground(new java.awt.Color(0, 51, 102));
        pnlListaTrab.setForeground(new java.awt.Color(255, 255, 255));
        pnlListaTrab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblListaT.setFont(new java.awt.Font("Unispace", 0, 36)); // NOI18N
        lblListaT.setForeground(new java.awt.Color(255, 255, 255));
        lblListaT.setText("LISTA DE TRABAJADORES");
        pnlListaTrab.add(lblListaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(177, 88, 88));
        jSeparator2.setForeground(new java.awt.Color(177, 88, 88));
        pnlListaTrab.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 78, 660, -1));

        tblTrabajadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTrabajadoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTrabajadores);

        pnlListaTrab.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 660, 470));

        btnRecargar.setBackground(new java.awt.Color(0, 51, 102));
        btnRecargar.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Escritorio\\ICONOS\\icons8-reload-50.png")); // NOI18N
        btnRecargar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRecargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });
        pnlListaTrab.add(btnRecargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        pnlDerecha.add(pnlListaTrab, "card3");

        getContentPane().add(pnlDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 680, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static int IdTrabajador = -1;
    private String sexo (){
        String sexo = "";
        if(jrdbtnFeme.isSelected()){
            sexo = "F";
        }else if(jrdbtnMasc.isSelected()){
            sexo = "M";
        }
            
            return sexo;
    }
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        int idDepart = cmbDepartamento.getSelectedIndex() + 1, 
            idDistrito = conex.idDistrito(String.valueOf(cmbDistrito.getSelectedItem())), 
            idProvici = cmbProvincia.getSelectedIndex() + 1;
        
        String  nom = txtNomCom.getText() , 
                numDoc = txtNumDoc.getText(), 
                sexo = sexo() , 
                tipoDoc = String.valueOf(cmbTipoDocumento1.getSelectedItem());
        
        if(idDepart != 0 && idDistrito != 0 && idProvici != 0 && nom.length() > 0 && numDoc.length() > 0
                && sexo.length() > 0){
             conex.agregarTrabajador(idDepart, idDistrito, idProvici, nom, numDoc, sexo, tipoDoc);
             limpiarDatos();
        }else{
            JOptionPane.showMessageDialog(null, "FALTAN UNO O MAS DATOS!");
        }
        IdTrabajador = -1;
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnListaTrab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaTrab1ActionPerformed
        pnlDatosPersonales.setVisible(false);
        pnlListaTrab.setVisible(true);
        conex.llenarTable(tblTrabajadores);
    }//GEN-LAST:event_btnListaTrab1ActionPerformed

    private void btnDatosP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosP1ActionPerformed
        pnlDatosPersonales.setVisible(true);
        pnlListaTrab.setVisible(false);
    }//GEN-LAST:event_btnDatosP1ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

      int idDepart = cmbDepartamento.getSelectedIndex() + 1, 
      idDistrito = conex.idDistrito(String.valueOf(cmbDistrito.getSelectedItem())), 
      idProvici = cmbProvincia.getSelectedIndex() + 1;
        
      String    nom = txtNomCom.getText() , 
                numDoc = txtNumDoc.getText(), 
                sexo = sexo() , 
                tipoDoc = String.valueOf(cmbTipoDocumento1.getSelectedItem());
        
        if(IdTrabajador!=-1){
             conex.modificarDatos(IdTrabajador,idDepart, idDistrito, idProvici, nom, numDoc, sexo, tipoDoc);
              JOptionPane.showMessageDialog(null, "TRABAJADOR MODIFICADO CORRECTAMENTE");
              limpiarDatos();
        }else{
            JOptionPane.showMessageDialog(null, "PARA ACTUALIZAR NECESITA SELECCIONAR UNA FILA \n EN LA TABLA DE LA LISTA DE TRABAJADORES");
        }   
    }//GEN-LAST:event_btnActualizarActionPerformed
    public void llenarDatos(){
        
    }
    private void tblTrabajadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTrabajadoresMouseClicked
       Point p = evt.getPoint();
       int Fila = tblTrabajadores.rowAtPoint(p);
       
       int idSeleccionado = Integer.parseInt(String.valueOf(tblTrabajadores.getValueAt(Fila, 0)));
       IdTrabajador = idSeleccionado;
       
       conex.llenarDatos(IdTrabajador,cmbTipoDocumento1,txtNumDoc,txtNomCom,cmbDepartamento,cmbProvincia,cmbDistrito,jrdbtnFeme,jrdbtnMasc);
         pnlDatosPersonales.setVisible(true);
        pnlListaTrab.setVisible(false);
    }//GEN-LAST:event_tblTrabajadoresMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked
    private void limpiarDatos(){
       IdTrabajador = -1;
       buttonGroup1.clearSelection();
       cmbDepartamento.setSelectedIndex(0);
       cmbDistrito.setSelectedIndex(0);
       cmbProvincia.setSelectedIndex(0);
       txtNomCom.setText("");
       txtNumDoc.setText("");
       cmbTipoDocumento1.setSelectedIndex(0);
       txtNumDoc.grabFocus();
    }
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
      limpiarDatos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
          if(IdTrabajador!=-1){
              int respuesta = JOptionPane.showConfirmDialog(null,"MENSAJE DE CONFIRMACION", "ESTA SEGURO QUE DESEA ELIMINAR EL TRABAJADOR SELECCIONADO ?",JOptionPane.YES_NO_OPTION);
              if(respuesta == 0){
                  conex.eliminarDatos(IdTrabajador);
              limpiarDatos();
              }else{
                  JOptionPane.showMessageDialog(null, "CANCELADO CORRECTAMENTE");
                  limpiarDatos();
              }
              
        }else{
            JOptionPane.showMessageDialog(null, "PARA ELIMINAR NECESITA SELECCIONAR UNA FILA \n EN LA TABLA DE LA LISTA DE TRABAJADORES");
        }   
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        conex.llenarTable(tblTrabajadores);
        JOptionPane.showMessageDialog(null, "TABLA RECARGADA CORRECTAMENTE");
    }//GEN-LAST:event_btnRecargarActionPerformed

    public static void main(String args[]) throws SQLException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Prueba().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnDatosP1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListaTrab1;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JButton btnReporte;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbDepartamento;
    private javax.swing.JComboBox<String> cmbDistrito;
    private javax.swing.JComboBox<String> cmbProvincia;
    private javax.swing.JComboBox<String> cmbTipoDocumento1;
    private javax.swing.JLabel iconoUser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton jrdbtnFeme;
    private javax.swing.JRadioButton jrdbtnMasc;
    private javax.swing.JLabel lblDep;
    private javax.swing.JLabel lblDistri;
    private javax.swing.JLabel lblListaT;
    private javax.swing.JLabel lblNC;
    private javax.swing.JLabel lblNDocum;
    private javax.swing.JLabel lblPanelDatosP;
    private javax.swing.JLabel lblProv;
    private javax.swing.JLabel lblSex;
    private javax.swing.JLabel lblTipoD;
    private javax.swing.JPanel pnlDatosPersonales;
    private javax.swing.JPanel pnlDerecha;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlListaTrab;
    private javax.swing.JTable tblTrabajadores;
    private javax.swing.JTextField txtNomCom;
    private javax.swing.JTextField txtNumDoc;
    // End of variables declaration//GEN-END:variables
}
