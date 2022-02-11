/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.functions;

import java.awt.Component;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrmango
 */
public class DBManagement {

    static DBConnection cnt = new DBConnection();
    static Connection cn;
    static Statement st;
    static ResultSet rs;
    static int id;
    static String userName;
    static DefaultTableModel model;

    public static void setUserName(String name) {
        userName = name;
    }

    public static String getUserName() {
        return userName;
    }

    public static int login(String user, String password) {
        String sqlAdmin = "select name, mail, password from admin";
        String sqlEmployee = "select firstName, mail, password from employee";
        try {
            cn = cnt.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sqlAdmin);
            while (rs.next()) {
                if (rs.getString("mail").equals(user) && rs.getString("password").equals(password)) {
                    setUserName(rs.getString("name"));
                    return 1;
                }
            }
            rs = st.executeQuery(sqlEmployee);
            while (rs.next()) {
                if (rs.getString("mail").equals(user) && rs.getString("password").equals(password)) {
                    setUserName(rs.getString("firstName"));
                    return 2;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return 0;
    }

    public static String getTxtFromTxtFields(Component[] pnlContent) {
        String sqlValue = "";
        int numOfTxtFields = 0, count = 0;
        for (Component cp : pnlContent) {
            if (cp instanceof JTextField) {
                numOfTxtFields++;
            }
        }
        for (Component cp : pnlContent) {
            if (cp instanceof JTextField) {
                count++;
                if (((JTextField) cp).getText().equals("")) {
                    return "";
                }
                if (numOfTxtFields > count) {
                    sqlValue += "'" + ((JTextField) cp).getText() + "',";
                } else {
                    sqlValue += "'" + ((JTextField) cp).getText() + "'";
                }
            }
        }
        return " values (" + sqlValue;
    }

    public static void clearTxtFields(Component[] pnlContent) {
        for (Component cp : pnlContent) {
            if (cp instanceof JTextField) {
                ((JTextField) cp).setText("");
            }
        }
    }

    public static void pushData2DB(String sql, String message) {
        try {
            cn = cnt.getConnection();
            st = cn.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, message);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void listEmployee(JTable tblEmployee) {
        String sql = "select * from employee";
        try {
            cn = cnt.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[] employee = new Object[6];
            model = (DefaultTableModel) tblEmployee.getModel();
            while (rs.next()) {
                employee[0] = rs.getString("idEmployee");
                employee[1] = rs.getString("firstName") + " " + rs.getString("lastName");
                employee[2] = rs.getString("nui");
                employee[3] = rs.getString("address");
                employee[4] = rs.getString("phone");
                employee[5] = rs.getString("mail");
                model.addRow(employee);
            }
            tblEmployee.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void modifyEmployee(JTable tblEmployee) {
        String[] fullNameArray;
        String fullName = "", name = "", lastName = "", nui = "", address = "", phone = "", email = "";
        int row = tblEmployee.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un Empleado");
        } else {
            id = Integer.parseInt((String) tblEmployee.getValueAt(row, 0).toString());
            fullName = (String) tblEmployee.getValueAt(row, 1);
            nui = (String) tblEmployee.getValueAt(row, 2);
            address = (String) tblEmployee.getValueAt(row, 3);
            phone = (String) tblEmployee.getValueAt(row, 4);
            email = (String) tblEmployee.getValueAt(row, 5);
        }
        fullNameArray = fullName.split(" ");
        name = fullNameArray[0];
        lastName = fullNameArray[1];
        String sql = "update employee set nui='" + nui + "',firstName='" + name + "',lastName='" + lastName + "',address='" + address + "',phone='" + phone + "',mail='" + email + "' where idEmployee=" + id;
        if (name.equals("") || lastName.equals("") || nui.equals("") || address.equals("") || phone.equals("")) {
            JOptionPane.showMessageDialog(null, "Rellene los campos necesarios");
        } else {
            try {
                cn = cnt.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Empleado Actualizado");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public static void deleteEmployee(JTable tblEmployee) {
        int row = tblEmployee.getSelectedRow();
        id = getID(row, tblEmployee);
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Empleado");
        } else {
            String sql = "delete from employee where idEmployee=" + id;
            try {
                cn = cnt.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Empleado Eliminado");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public static int getID(int row, JTable tblEmployee) {
        id = Integer.parseInt((String) tblEmployee.getValueAt(row, 0).toString());
        return id;
    }

    public static void clearTbl() {
        model.setRowCount(0);
    }
}
