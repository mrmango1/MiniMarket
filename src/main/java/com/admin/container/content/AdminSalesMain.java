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
        pnlSearch = new java.awt.Panel();
        id = new javax.swing.JLabel();
        search_icon = new javax.swing.JLabel();
        search = new javax.swing.JTextField();

        setBackground(new java.awt.Color(236, 239, 244));
        setMinimumSize(new java.awt.Dimension(810, 490));
        setPreferredSize(new java.awt.Dimension(810, 490));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContent.setBackground(new java.awt.Color(229, 233, 240));
        pnlContent.setMinimumSize(new java.awt.Dimension(454, 239));
        pnlContent.setPreferredSize(new java.awt.Dimension(454, 239));
        pnlContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(229, 233, 240));
        jTable1.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ID.Empleado", "ID.Cliente", "Fecha", "Total Productos", "Subtotal", "Venta Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new java.awt.Color(229, 233, 240));

        pnlContent.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 700, 350));

        add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 780, 400));

        pnlSearch.setBackground(new java.awt.Color(236, 239, 244));
        pnlSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        id.setText("ID");
        pnlSearch.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 20, 30));

        search_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        search_icon.setText("jLabel2");
        pnlSearch.add(search_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 30, 30));

        search.setBackground(new java.awt.Color(229, 233, 240));
        search.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        search.setBorder(null);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        pnlSearch.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 140, 30));

        add(pnlSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 230, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel id;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pnlContent;
    private java.awt.Panel pnlSearch;
    private javax.swing.JTextField search;
    private javax.swing.JLabel search_icon;
    // End of variables declaration//GEN-END:variables
}
