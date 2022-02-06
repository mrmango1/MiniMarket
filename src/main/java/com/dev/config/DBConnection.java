/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.config;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author mrmango
 */
public class DBConnection {
    Connection con;
    public DBConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/qmet", "root", "1234");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    } 
    public Connection getConnection(){
        return con;
    }
}
