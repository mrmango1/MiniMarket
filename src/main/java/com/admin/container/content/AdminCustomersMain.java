/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.admin.container.content;

import java.awt.Dimension;
import javax.swing.BorderFactory;

/**
 *
 * @author hp
 */
public class AdminCustomersMain extends javax.swing.JPanel {

    /**
     * Creates new form AdminCustomersMain
     */
    public AdminCustomersMain() {
        initComponents();
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
        tblCustomers = new javax.swing.JTable();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        search = new javax.swing.JPanel();
        txtFldSearch = new javax.swing.JTextField();
        searchID = new javax.swing.JLabel();
        search_icon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 239, 244));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContent.setBackground(new java.awt.Color(229, 233, 240));
        pnlContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCustomers.setBackground(new java.awt.Color(229, 233, 240));
        tblCustomers.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        tblCustomers.setForeground(new java.awt.Color(67, 76, 94));
        tblCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "NUI", "Direccion", "Telefono", "Email"
            }
        ));
        tblCustomers.setFocusable(false);
        tblCustomers.setRowHeight(35);
        tblCustomers.setSelectionBackground(new java.awt.Color(235, 203, 139));
        tblCustomers.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblCustomers);
        if (tblCustomers.getColumnModel().getColumnCount() > 0) {
            tblCustomers.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblCustomers.getColumnModel().getColumn(4).setPreferredWidth(50);
        }
        tblCustomers.getTableHeader().setOpaque(false);
        tblCustomers.getTableHeader().setBackground(new java.awt.Color(229, 233, 240));
        tblCustomers.getTableHeader().setForeground(new java.awt.Color(46,52,64));
        tblCustomers.getTableHeader().setFont(new java.awt.Font("Roboto", 1, 14));

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

        search.setBackground(new java.awt.Color(136, 192, 208));
        search.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFldSearch.setBackground(new java.awt.Color(136, 192, 208));
        txtFldSearch.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        txtFldSearch.setBorder(null);
        txtFldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldSearchActionPerformed(evt);
            }
        });
        search.add(txtFldSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 8, 100, 20));

        searchID.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        searchID.setForeground(new java.awt.Color(59, 66, 82));
        searchID.setText("ID");
        search.add(searchID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, 20, 20));

        search_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        search_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        search.add(search_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 8, 30, 20));

        add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 462, 170, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtFldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel search;
    private javax.swing.JLabel searchID;
    private javax.swing.JLabel search_icon;
    private javax.swing.JTable tblCustomers;
    private javax.swing.JTextField txtFldSearch;
    // End of variables declaration//GEN-END:variables
}
