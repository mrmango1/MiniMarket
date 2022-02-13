/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.functions;

import java.awt.Component;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
    static ResultSetMetaData rsmd;
    static String id, userName, tableNameDB, sqlQuery;
    static DefaultTableModel model;
    static Object[] object;
    static String[] queryHeader;
    static boolean completeName, correctDataToModify = true;

//Login methods
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
//Consultar y Actulizar DB

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

    public static void pushData2DB(String sqlAdd, String message) {
        try {
            cn = cnt.getConnection();
            st = cn.createStatement();
            st.executeUpdate(sqlAdd);
            JOptionPane.showMessageDialog(null, message);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void getModel(JTable table) {
        try {
            cn = cnt.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sqlQuery);
            rsmd = rs.getMetaData();
            tableNameDB = rsmd.getTableName(1);
            queryHeader = new String[rsmd.getColumnCount()];
            for (int i = 0, name_lastName = 0; i < rsmd.getColumnCount(); i++) {
                if (rsmd.getColumnName(i + 1).equals("firstName") || rsmd.getColumnName(i + 1).equals("lastName")) {
                    name_lastName++;
                    completeName = name_lastName == 2;
                }
                queryHeader[i] = rsmd.getColumnName(i + 1);
            }
            object = new Object[queryHeader.length - 1];
            model = (DefaultTableModel) table.getModel();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void showQueryInTable(JTable table, String __sqlQuery) {
        sqlQuery = __sqlQuery;
        try {
            getModel(table);
            while (rs.next()) {
                for (int i = 0, a = 0; i < queryHeader.length - 1; i++) {
                    if (i == 1 && completeName) {
                        object[i] = rs.getString(queryHeader[a]) + " " + rs.getString(queryHeader[++a]);
                    } else {
                        object[i] = rs.getString(queryHeader[a]);
                    }
                    a++;
                }
                model.addRow(object);
            }
            table.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void modifySimpleTable(JTable table) {
        String[] fullNameArray;
        String sqlData = "";
        int row = table.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un Fila");
        } else {
            id = (String) table.getValueAt(row, 0);
            for (int i = 1, a = 1; i < table.getColumnCount(); i++) {
                if(((String) table.getValueAt(row, i)).equals("")){
                    correctDataToModify=false;
                    break;
                }
                if (i < (table.getColumnCount()-1)) {
                    if (completeName & queryHeader[i].equals("firstName")) {
                        fullNameArray = ((String) table.getValueAt(row, i)).split(" ");
                        if(fullNameArray.length!=2){
                            correctDataToModify=false;
                            break;
                        }
                        sqlData += queryHeader[a] + "='" + fullNameArray[0] + "',";
                        a++;
                        sqlData += queryHeader[a] + "='" + fullNameArray[1] + "',";
                    } else {
                        sqlData += queryHeader[a] + "='" + (String) table.getValueAt(row, i) + "',";
                    }
                } else {
                    sqlData += queryHeader[a] + "='" + (String) table.getValueAt(row, i) + "'";
                }
                a++;
            }
        }
        String sqlUpdate = "update employee set " + sqlData + " where "+ queryHeader[0] + "="+id;
        if (!correctDataToModify) {
            JOptionPane.showMessageDialog(null, "Rellene los campos necesarios");
        } else {
            try {
                cn = cnt.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sqlUpdate);
                JOptionPane.showMessageDialog(null, "Registro Actualizado");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        model.setRowCount(0);
        showQueryInTable(table, sqlQuery);
    }

    public static void deleteDataFromDB(JTable table) {
        int row = table.getSelectedRow();
        id = (String) table.getValueAt(row, 0);
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        } else {
            String sqlDelete = "delete from " + tableNameDB + " where " + queryHeader[0] + "=" + id;
            System.out.println(sqlDelete);
            try {
                cn = cnt.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sqlDelete);
                JOptionPane.showMessageDialog(null, "Eliminado Correctamente");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        model.setRowCount(0);
        showQueryInTable(table, sqlQuery);
    }
}