/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin.container.content;

import java.awt.Dimension;
import javax.swing.BorderFactory;

/**
 *
 * @author USER
 */
public class AdminSalesMain extends javax.swing.JPanel {

    /**
     * Creates new form AdminSalesMain
     */
    public AdminSalesMain() {
        initComponents();
        jScrollPane1.setBorder(BorderFactory.createEmptyBorder());
        jScrollPane1.getVerticalScrollBar().setPreferredSize( new Dimension(0,0) );
        jTable1.getTableHeader().setFont(new java.awt.Font("Roboto Medium", 0, 14));
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
        jTable1 = new javax.swing.JTable();
        search = new javax.swing.JPanel();
        txtFldSearch = new javax.swing.JTextField();
        searchID = new javax.swing.JLabel();
        search_icon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 239, 244));
        setMinimumSize(new java.awt.Dimension(810, 490));
        setPreferredSize(new java.awt.Dimension(810, 490));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContent.setBackground(new java.awt.Color(229, 233, 240));
        pnlContent.setMinimumSize(new java.awt.Dimension(454, 239));
        pnlContent.setPreferredSize(new java.awt.Dimension(454, 239));
        pnlContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(229, 233, 240));
        jTable1.setFont(new java.awt.Font("Roboto Light", 0, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ID.Empleado", "ID.Cliente", "Fecha", "Total Productos", "Subtotal", "Venta Total"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setRowHeight(35);
        jTable1.setSelectionBackground(new java.awt.Color(235, 203, 139));
        jScrollPane1.setViewportView(jTable1);
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new java.awt.Color(229, 233, 240));

        pnlContent.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 800, 400));

        add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 440));

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
        searchID.setForeground(new java.awt.Color(60, 63, 65));
        searchID.setText("ID");
        search.add(searchID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, 20, 20));

        search_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        search_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        search.add(search_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 8, 30, 20));

        add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 462, 170, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void txtFldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldSearchActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel search;
    private javax.swing.JLabel searchID;
    private javax.swing.JLabel search_icon;
    private javax.swing.JTextField txtFldSearch;
    // End of variables declaration//GEN-END:variables
}
