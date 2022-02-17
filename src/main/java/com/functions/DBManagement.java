/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.functions;

import java.awt.Component;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * @author mrmango
 */
public class DBManagement {

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

    //Obtener datos de un JTextField
    public static ArrayList<String> getTxtFromTxtFields(Component[] pnlComponents) {
        String valuesFromComponent;
        ArrayList<String> valuesForStatement = new ArrayList<>();
        for (Component pnlComponent : pnlComponents) {
            if (pnlComponent instanceof JTextField) {
                valuesFromComponent = ((JTextField) pnlComponent).getText();
                if (valuesFromComponent.equals("")) {
                    return null;
                }
                valuesForStatement.add(valuesFromComponent);
            }
        }
        return valuesForStatement;
    }
    //Insertar datos a la base de datos(metodo general para tablas string)
    public static void insertDataDB(ArrayList<String> valuesForStatement, String sql) {
        //insert into admin(a,s,f,s,d,) values (?,?,?,?,?)
        int count = 0;
        try {
            cn = cnt.getConnection();
            pst = cn.prepareStatement(sql);
            for (String value : valuesForStatement) {
                count++;
                pst.setString(count, value);
            }
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha registrado exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    //Insertar datos a la base de datos(Metodo para la tabla products)
    public static void insertDataProducts(ArrayList<String> valuesForStatement, String sql) {
        //insert into admin(a,s,f,s,d,) values (?,?,?,?,?)
        try {
            cn = cnt.getConnection();
            pst = cn.prepareStatement(sql);
            pst.setString(1, valuesForStatement.get(0));
            pst.setInt(2, Integer.parseInt(valuesForStatement.get(1)));
            pst.setDouble(3, Double.parseDouble(valuesForStatement.get(2)));
            pst.setDouble(4, Double.parseDouble(valuesForStatement.get(2)));
            pst.setDouble(5, Double.parseDouble(valuesForStatement.get(2)));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha registrado exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    //Borrar datos de un JTextField
    public static void clearTxtFields(Component[] pnlComponents) {
        Component[] JScrollComponents = new Component[1];
        for (Component pnlComponent : pnlComponents) {
            if (pnlComponent instanceof JTextField) {
                ((JTextField) pnlComponent).setText("");
            }
            if (pnlComponent instanceof JScrollPane) {
                JScrollComponents = ((JScrollPane) pnlComponent).getComponents();
                for (Component JScrollComponent : JScrollComponents) {
                    if (JScrollComponent instanceof JTextArea) {
                        ((JTextArea) JScrollComponent).setText("");
                    }
                }
            }
        }
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

    //Metodo para listar los datos en un JComboBox
    public static void listOnComboBox(JComboBox CBox, String sql) {
        try {
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                CBox.addItem(rs.getString("name"));
            }
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
