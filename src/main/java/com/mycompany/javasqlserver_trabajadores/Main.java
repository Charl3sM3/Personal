/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javasqlserver_trabajadores;

import java.sql.SQLException;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        ConexionSQL objectConexion = new ConexionSQL();
        objectConexion.establecerConexion();
        //objectConexion.verTabla("dbo.Departamento");
        
        GUI_Prueba gui = new GUI_Prueba();
        gui.setVisible(true);
        
    }
}
