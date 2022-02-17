/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.main.container.content;

import com.functions.DBManagement;

import java.awt.Dimension;
import javax.swing.BorderFactory;

/**
 *
 * @author mrmango
 */
public class EmployeesMain extends javax.swing.JPanel {

    String sql = "select idEmployee,firstname, lastName,nui, address, phone, mail, status from employees";

    public EmployeesMain() {
        initComponents();
        DBManagement.showQueryInTable(tblEmployee, sql);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContent = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        pnlSearch = new javax.swing.JPanel();
        searchID = new javax.swing.JLabel();
        search_icon = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        setBackground(new java.awt.Color(236, 239, 244));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContent.setBackground(new java.awt.Color(229, 233, 240));
        pnlContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        tblEmployee.setAutoCreateRowSorter(true);
        tblEmployee.setBackground(new java.awt.Color(229, 233, 240));
        tblEmployee.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        tblEmployee.setForeground(new java.awt.Color(67, 76, 94));
        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "NUI", "Dirección", "Telefono", "Email", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmployee.setFocusable(false);
        tblEmployee.setGridColor(new java.awt.Color(216, 222, 233));
        tblEmployee.setRowHeight(35);
        tblEmployee.setSelectionBackground(new java.awt.Color(235, 203, 139));
        tblEmployee.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblEmployee.setShowGrid(false);
        tblEmployee.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblEmployee);
        if (tblEmployee.getColumnModel().getColumnCount() > 0) {
            tblEmployee.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblEmployee.getColumnModel().getColumn(0).setMaxWidth(60);
        }
        tblEmployee.getTableHeader().setOpaque(false);
        tblEmployee.getTableHeader().setBackground(new java.awt.Color(229, 233, 240));
        tblEmployee.getTableHeader().setForeground(new java.awt.Color(46,52,64));
        tblEmployee.getTableHeader().setFont(new java.awt.Font("Roboto", 1, 14));

        pnlContent.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 800, 400));
        jScrollPane1.setBorder(BorderFactory.createEmptyBorder());
        jScrollPane1.getVerticalScrollBar().setPreferredSize( new Dimension(0,0) );

        add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 440));

        btnModify.setBackground(new java.awt.Color(163, 190, 140));
        btnModify.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btnModify.setForeground(new java.awt.Color(67, 76, 94));
        btnModify.setText("Modificar");
        btnModify.setBorder(null);
        btnModify.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 120, 40));

        btnDelete.setBackground(new java.awt.Color(208, 135, 112));
        btnDelete.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(67, 76, 94));
        btnDelete.setText("Eliminar");
        btnDelete.setBorder(null);
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 120, 40));

        pnlSearch.setBackground(new java.awt.Color(136, 192, 208));
        pnlSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchID.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        searchID.setForeground(new java.awt.Color(59, 66, 82));
        searchID.setText("ID");
        pnlSearch.add(searchID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, 20, 20));

        search_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        search_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        pnlSearch.add(search_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 8, 30, 20));

        txtSearch.setBackground(new java.awt.Color(136, 192, 208));
        txtSearch.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(46, 52, 64));
        txtSearch.setBorder(null);
        pnlSearch.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 8, 100, 20));

        add(pnlSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 462, 170, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        DBManagement.modifySimpleTable(tblEmployee);
        
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DBManagement.inactiveDB(tblEmployee);
    }//GEN-LAST:event_btnDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JLabel searchID;
    private javax.swing.JLabel search_icon;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
