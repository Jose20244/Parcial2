/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mysql.conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    public static void  conexion(){
        Connection con = null;
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/deportesbdd?useUnicode=true&useJDBCCompliantTimezoneShift=true"
                    + "&useLegacyDatetimeCode=false&serverTimezone=UTC","root","50827");
            if(con!=null){
                
            }
        }catch(Exception e){
            System.out.println("Ocurrion un error, "+e.getMessage());
        }
    }
}
