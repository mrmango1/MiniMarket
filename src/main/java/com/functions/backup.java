/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.functions;

import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrmango
 */
public class backup {

    static DBConnection cnt = new DBConnection();
    static Connection cn = cnt.getConnection();
    static Statement st;
    static PreparedStatement pst;
    static ResultSet rs;
    static ResultSetMetaData rsmd;
    static String id, userName, tableNameDB, sqlQuery, idCategory;
    static DefaultTableModel model;
    static Object[] object;
    static String[] queryHeader, productsToModify;
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
        String sqlEmployee = "select firstName, mail, password from employees";
        try {
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

    //Obtener y borrar datos de un JTextField
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

    // Metodos especificos para Category
    public static String getTxtCategories(JTextField txtField, JTextArea txtArea) {
        String sqlValue = "";
        if (txtField.getText().equals("") || txtArea.getText().equals("")) {
            return "";
        }
        sqlValue = " values ('" + txtField.getText() + "','" + txtArea.getText() + "'";
        txtField.setText("");
        txtArea.setText("");
        return sqlValue;
    }

    //Metodo para modificar los productos usando textfields
    public static String getTxtForUpdate(Component[] pnlContent) {
        String sqlValue = "update products set ";
        int idCat;
        String[] valuesToChange = {"name", "stock", "price", "pvp", "discount", "idCategories"};
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
                    sqlValue += valuesToChange[count - 1] + "='" + ((JTextField) cp).getText() + "',";
                } else {
                    sqlValue += valuesToChange[count - 1] + "='" + ((JTextField) cp).getText() + "'";
                }
            }
        }
        for (Component cp : pnlContent) {
            if (cp instanceof JComboBox) {
                idCat = ((JComboBox) cp).getSelectedIndex() + 1;
                sqlValue += ",idCategories='" + idCat + "'";
            }
        }
        System.out.println(sqlValue + " where idProduct=" + idCategory);
        return sqlValue + "where idProduct=" + (idCategory);
    }

    public static void getIDProduct(JTable table) {
        idCategory = (String) table.getValueAt(table.getSelectedRow(), 0);

    }

    public static void showQueryInTextFields(Component[] pnlContent, String __sqlQuery) {
        int count = 0;
        sqlQuery = __sqlQuery;
        sqlQuery += "" + idCategory;
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sqlQuery);
            productsToModify = new String[5];
            while (rs.next()) {
                for (int i = 0; i < productsToModify.length; i++) {
                    productsToModify[i] = rs.getString(queryHeader[i + 1]);
                }
            }
            for (Component cp : pnlContent) {
                if (cp instanceof JTextField) {
                    ((JTextField) cp).setText(productsToModify[count]);
                    count++;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //Metodo para listar los nombres de las categories en el JComboBox para
    //elegir las categorias
    public static void categoryBox(JComboBox bxCategories) {
        sqlQuery = "select name from categories";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sqlQuery);
            while (rs.next()) {
                bxCategories.addItem(rs.getString("name"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //Metodo para obtener el categoyId usando el nombre escogido en el JComboBox
    public static String getCategoryID(JComboBox bxCategories) {
        bxCategories.getSelectedIndex();
        sqlQuery = "select idCategories from categories where name='" + bxCategories.getSelectedItem().toString() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sqlQuery);
            while (rs.next()) {
                return rs.getString("idCategories");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return "0";
    }

    //Metodo para realizar un ingreso de datos a la DB
    public static void pushData2DB(String sqlAdd, String message) {
        try {
            st = cn.createStatement();
            st.executeUpdate(sqlAdd);
            JOptionPane.showMessageDialog(null, message);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        model.setRowCount(0);
    }

    // Metodo para obtener el modelo a ingresar en la tabla
    public static void getModel(JTable table) {
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sqlQuery);
            rsmd = rs.getMetaData();
            tableNameDB = rsmd.getTableName(1);
            queryHeader = new String[rsmd.getColumnCount()];
            completeName = false;
            for (int i = 0, name_lastName = 0; i < rsmd.getColumnCount(); i++) {
                if (rsmd.getColumnName(i + 1).equals("firstName") || rsmd.getColumnName(i + 1).equals("lastName")) {
                    name_lastName++;
                    completeName = name_lastName == 2;
                }
                queryHeader[i] = rsmd.getColumnName(i + 1);
            }
            object = new Object[table.getColumnCount()];
            model = (DefaultTableModel) table.getModel();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //Metodo para mostrar una consulta de la base de datos en una JTable
    public static void showQueryInTable(JTable table, String __sqlQuery) {
        sqlQuery = __sqlQuery;
        try {
            getModel(table);
            while (rs.next()) {
                for (int i = 0, a = 0; i < table.getColumnCount(); i++) {
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

    //Metodo para modificar un dato de la DB desde la JTable
    public static void modifySimpleTable(JTable table) {
        String[] fullNameArray;
        String sqlData = "";
        int row = table.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un Fila");
        } else {
            id = (String) table.getValueAt(row, 0);
            for (int i = 1, a = 1; i < table.getColumnCount(); i++) {
                if (((String) table.getValueAt(row, i)).equals("")) {
                    correctDataToModify = false;
                    break;
                }
                if (i < (table.getColumnCount() - 1)) {
                    if (completeName & queryHeader[i].equals("firstName")) {
                        fullNameArray = ((String) table.getValueAt(row, i)).split(" ");
                        if (fullNameArray.length != 2) {
                            correctDataToModify = false;
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
        pushUpdateDB(sqlData);
        showQueryInTable(table, sqlQuery);
    }

    //Metodo para realizar el update
    public static void pushUpdateDB(String sqlData) {
        String sqlUpdate = "update " + tableNameDB + " set " + sqlData + " where " + queryHeader[0] + "=" + id;
        if (!correctDataToModify) {
            JOptionPane.showMessageDialog(null, "Rellene los campos necesarios");
        } else {
            try {
                st = cn.createStatement();
                st.executeUpdate(sqlUpdate);
                JOptionPane.showMessageDialog(null, "Registro Actualizado");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        model.setRowCount(0);
    }    
    //Metodo para realizar el update de dos tablas
    public static void pushUpdateJoinDB(String sqlData) {
        String sqlUpdate = "update product  set " + sqlData + " where " + queryHeader[0] + "=" + id;
        if (!correctDataToModify) {
            JOptionPane.showMessageDialog(null, "Rellene los campos necesarios");
        } else {
            try {
                st = cn.createStatement();
                st.executeUpdate(sqlUpdate);
                JOptionPane.showMessageDialog(null, "Registro Actualizado");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        model.setRowCount(0);
    }

    //Metodo para eliminar un valor seleccionado de la JTable en la base de Datos
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

    //Metodo para hacer inactivo un valor Seleccionado en la Jtable en la base de datos
    public static void inactiveDB(JTable table) {
        int row = table.getSelectedRow();
        id = (String) table.getValueAt(row, 0);
        String sqlUpdate = "update " + tableNameDB + " set status='inactive' where " + queryHeader[0] + "=" + id;
        if (!correctDataToModify) {
            JOptionPane.showMessageDialog(null, "Ya esta inactivo");
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
}
