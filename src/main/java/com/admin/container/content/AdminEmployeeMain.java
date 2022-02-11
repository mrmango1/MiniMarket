/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.admin.container.content;

import com.functions.DBConnection;
import com.functions.DBManagement;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.*;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author mrmango
 */
public class AdminEmployeeMain extends javax.swing.JPanel {

    DBConnection cnt = new DBConnection();
    Connection cn;
    Statement st;
    ResultSet rs;
    int id;
    DefaultTableModel model;
    
    final DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
    AdminEmployeeAdd add = new AdminEmployeeAdd();
    public AdminEmployeeMain() {
        initComponents();
        jScrollPane1.setBorder(BorderFactory.createEmptyBorder());
        jScrollPane1.getVerticalScrollBar().setPreferredSize( new Dimension(0,0) );
        tblEmployee.getTableHeader().setFont(new java.awt.Font("Roboto", Font.BOLD, 15));
        DBManagement.listEmployee(tblEmployee);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(236, 239, 244));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(229, 233, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        tblEmployee.setBackground(new java.awt.Color(229, 233, 240));
        tblEmployee.setFont(new java.awt.Font("Roboto Condensed", 0, 13)); // NOI18N
        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "NUI", "Dirección", "Telefono", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmployee.setFocusable(false);
        tblEmployee.setGridColor(new java.awt.Color(216, 222, 233));
        tblEmployee.setRowHeight(40);
        tblEmployee.setSelectionBackground(new java.awt.Color(129, 161, 193));
        tblEmployee.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblEmployee.setShowGrid(false);
        tblEmployee.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblEmployee);
        if (tblEmployee.getColumnModel().getColumnCount() > 0) {
            tblEmployee.getColumnModel().getColumn(0).setResizable(false);
            tblEmployee.getColumnModel().getColumn(0).setPreferredWidth(1);
        }
        tblEmployee.getTableHeader().setOpaque(false);
        tblEmployee.getTableHeader().setBackground(new java.awt.Color(229, 233, 240));

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 700, 340));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 32, 780, 400));

        btnModify.setBackground(new java.awt.Color(143, 188, 187));
        btnModify.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btnModify.setForeground(new java.awt.Color(76, 86, 106));
        btnModify.setText("Modificar");
        btnModify.setBorder(null);
        btnModify.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 120, 40));

        btnDelete.setBackground(new java.awt.Color(208, 135, 112));
        btnDelete.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(76, 86, 106));
        btnDelete.setText("Delete");
        btnDelete.setBorder(null);
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 120, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        DBManagement.modifyEmployee(tblEmployee);
        DBManagement.clearTbl();
        DBManagement.listEmployee(tblEmployee);
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DBManagement.deleteEmployee(tblEmployee);
        DBManagement.clearTbl();
        DBManagement.listEmployee(tblEmployee);
    }//GEN-LAST:event_btnDeleteActionPerformed

    public void listEmployee(){
        String sql="select * from employee";
        try{
            cn=cnt.getConnection();
            st=cn.createStatement();
            rs=st.executeQuery(sql);
            Object[] employee = new Object[6];
            model = (DefaultTableModel)tblEmployee.getModel();
            while(rs.next()){
                employee[0]=rs.getString("idEmployee");
                employee[1]=rs.getString("firstName")+" "+rs.getString("lastName");
                employee[2]=rs.getString("nui");
                employee[3]=rs.getString("address");
                employee[4]=rs.getString("phone");
                employee[5]=rs.getString("mail");
                model.addRow(employee);
            }
            tblEmployee.setModel(model);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void modifyEmployee(){
        String[] fullNameArray;
        String fullName="",name="",lastName="", nui="", address="", phone="", email="";
        int row = tblEmployee.getSelectedRow();
        if(row==-1){
            JOptionPane.showMessageDialog(null, "Seleccione un Empleado");
        }else{
            id=Integer.parseInt((String)tblEmployee.getValueAt(row,0).toString());
            fullName=(String)tblEmployee.getValueAt(row, 1);
            nui=(String)tblEmployee.getValueAt(row, 2);
            address=(String)tblEmployee.getValueAt(row, 3);
            phone=(String)tblEmployee.getValueAt(row, 4);
            email=(String)tblEmployee.getValueAt(row, 5);
        }
        fullNameArray=fullName.split(" ");
        name=fullNameArray[0];
        lastName=fullNameArray[1];
        String sql = "update employee set nui='" + nui + "',firstName='" + name + "',lastName='" + lastName + "',address='" + address + "',phone='" + phone + "',mail='" + email + "' where idEmployee="+id;
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
    public void deleteEmployee(){
        int row = tblEmployee.getSelectedRow();
        id = getID(row);
        if (row==-1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Empleado");
        } else {
            String sql="delete from employee where idEmployee="+id;
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
    public int getID(int row){
        id=Integer.parseInt((String)tblEmployee.getValueAt(row,0).toString());
        return id;
    }
    public void clearTbl(){
        model.setRowCount(0);
        listEmployee();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmployee;
    // End of variables declaration//GEN-END:variables
}