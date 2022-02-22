/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.functions;

import java.awt.Component;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * @author mrmango
 */
public class DB {

    static String idTable, userName,userPwd, idUser, tableNameDB, sqlQuery, idCategory;
    static double totalPrice;
    static boolean completeName, correctDataToModify = true;

    static DBConnection cnt = new DBConnection();
    static Connection cn = cnt.getConnection();
    static Statement st;
    static PreparedStatement pst;
    static ResultSet rs;
    static ResultSetMetaData rsmd;

    static DefaultTableModel model;
    static Object[] object;
    static String[] queryHeader, productsToModify;
    static HashMap<Integer, Integer> productsAndAmount = new HashMap();

    //Login methods
    public static String getUserName() {
        return userName;
    }
    public static String getUserPwd() {
        return userPwd;
    }
    public static String getID() {
        return idUser;
    }

    public static int login(String user, String password) {
        String sql;
        String[] roles = {"admin", "employees"};
        String[] data = {user, password};
        try {
            cn = cnt.getConnection();
            for (int i = 0; i < 2; i++) {
                sql = "select * from " + roles[i] + " where mail=? and password=md5(?)";
                pst = cn.prepareStatement(sql);
                pst.setString((1), data[0]);
                pst.setString((2), data[1]);
                rs = pst.executeQuery();
                if (rs.next()) {
                    userName = rs.getString("firstName");
                    userPwd = password;
                    if (i == 0) {
                        idUser = rs.getString("idAdmin");
                        return 1;
                    } else if (i == 1) {
                        idUser = rs.getString("idEmployee");
                        return 2;
                    }
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
            pst.setDouble(4, Double.parseDouble(valuesForStatement.get(3)));
            pst.setDouble(5, Double.parseDouble(valuesForStatement.get(4)));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha registrado exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //Borrar datos de un JTextField
    public static void clearTxtFields(Component[] pnlComponents) {
        for (Component pnlComponent : pnlComponents) {
            if (pnlComponent instanceof JTextField) {
                ((JTextField) pnlComponent).setText("");
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
    public static void tableSorter(JTable table, String query){
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter(model);
        table.setRowSorter(rowSorter);
        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)"+query.trim()));
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
    public static void listOnComboBox(JComboBox CBox, String table, String data) {
        String sql = "select " + data + " from " + table;
        // sql = select stock from products 
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                CBox.addItem(rs.getString(data));
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
            idTable = (String) table.getValueAt(row, 0);
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
            pushUpdateDB(sqlData);
        }
        model.setRowCount(0);
        showQueryInTable(table, sqlQuery);
    }

    //Metodo para realizar el update
    public static void pushUpdateDB(String sqlData) {
        String sqlUpdate = "update " + tableNameDB + " set " + sqlData + " where " + queryHeader[0] + "=" + idTable;
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
        String sqlUpdate = "update product  set " + sqlData + " where " + queryHeader[0] + "=" + idTable;
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
        idTable = (String) table.getValueAt(row, 0);
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        } else {
            String sqlDelete = "delete from " + tableNameDB + " where " + queryHeader[0] + "=" + idTable;
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
        idTable = (String) table.getValueAt(row, 0);
        String sqlUpdate = "update " + tableNameDB + " set status='INACTIVO' where " + queryHeader[0] + "=" + idTable;
        try {
            st = cn.createStatement();
            st.executeUpdate(sqlUpdate);
            JOptionPane.showMessageDialog(null, "Eliminado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        model.setRowCount(0);
        showQueryInTable(table, sqlQuery);
    }

    //Metodo para mostrar una consulta de la base de datos en una JTable
    public static void showQuerySell(JTable table, String __sqlQuery, int values) {
        double discount;
        double pvp;
        double result;
        sqlQuery = __sqlQuery;
        try {
            getModel(table);
            while (rs.next()) {
                for (int i = 0; i < table.getColumnCount() - 2; i++) {
                    object[i] = rs.getString(queryHeader[i]);
                }
                object[5] = values;
                pvp = rs.getFloat("pvp");
                discount = rs.getInt("discount");
                result = -pvp * ((discount - 100) / 100);
                totalPrice += Math.round(result * values * 100.0) / 100.0;
                object[6] = Math.round(result * values * 100.0) / 100.0;
                model.addRow(object);
            }
            table.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static double getTotalPrice() {
        return totalPrice;
    }

    public static void resetTotalPrice() {
        totalPrice = 0;
    }

    public static void insertData(String sqlInsert, Integer idCustomer) {
        String getIdLastQuery = "SELECT LAST_INSERT_ID()";
        Integer idOrders = null;
        String sql = "insert into orderDetails(idOrder,idProduct,quantity) values (?,?,?)";
        try {
            pst = cn.prepareStatement(sqlInsert);
            if (idCustomer == 1) {
                pst.setInt(1, idCustomer);
            } else if (idCustomer == 0) {
                st = cn.createStatement();
                rs = st.executeQuery(getIdLastQuery);
                while (rs.next()) {
                    pst.setInt(1, rs.getInt(1));
                }
            } else {
                pst.setInt(1, idCustomer);
            }
            pst.executeUpdate();
            st = cn.createStatement();
            rs = st.executeQuery(getIdLastQuery);
            while (rs.next()) {
                idOrders = rs.getInt(1);
            }
            pst = cn.prepareStatement(sql);
            for (Integer idProduct : productsAndAmount.keySet()) {
                pst.setInt(1, idOrders);
                pst.setInt(2, idProduct);
                pst.setInt(3, productsAndAmount.get(idProduct));
                pst.executeUpdate();
            }
            JOptionPane.showMessageDialog(null, "Compra realizada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        productsAndAmount.clear();
    }

    public static String searchCustomer(String nui, Component[] pnlComponents) {
        String idCustomer = null;
        String sqlSelect = "SELECT * from customers where nui=?";
        int count = 2;
        try {
            pst = cn.prepareStatement(sqlSelect);
            pst.setString(1, nui);
            rs = pst.executeQuery();
            if (rs.next()) {
                idCustomer = rs.getString("idCustomer");
                for (Component pnlComponent : pnlComponents) {
                    if (pnlComponent instanceof JTextField) {
                        ((JTextField) pnlComponent).setText(rs.getString(count++));
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay un cliente registrado");
                return null;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return idCustomer;
    }

    public static void getUserData(String sql, Component[] pnlComponents) {
        int count = 1;
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, getID());
            rs = pst.executeQuery();
            while (rs.next()) {
                for (Component pnlComponent : pnlComponents) {
                    if (pnlComponent instanceof JTextField) {
                        ((JTextField) pnlComponent).setText(rs.getString(count++));
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void getHashSellDetails(int products, int amount) {
        productsAndAmount.put(products, amount);
    }
}
