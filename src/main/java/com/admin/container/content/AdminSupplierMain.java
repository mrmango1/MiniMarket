/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.admin.container.content;

import java.awt.Dimension;
import javax.swing.BorderFactory;

/**
 *
 * @author mrmango
 */
public class AdminSupplierMain extends javax.swing.JPanel {

    /**
     * Creates new form AdminSupplierMain
     */
    public AdminSupplierMain() {
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(236, 239, 244));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(229, 233, 240));
        jPanel2.setPreferredSize(new java.awt.Dimension(740, 370));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(229, 233, 240));
        jTable1.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jTable1.setForeground(new java.awt.Color(76, 86, 106));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre Proveedor", "RUC", "Dirección", "Teléfono", "Correo"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(236, 239, 244));
        jTable1.setSelectionBackground(new java.awt.Color(236, 239, 244));
        jTable1.setSelectionForeground(new java.awt.Color(236, 239, 244));
        jScrollPane1.setViewportView(jTable1);
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new java.awt.Color(229, 233, 240));

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 700, 340));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 32, 780, 400));

        jButton1.setBackground(new java.awt.Color(143, 188, 187));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(76, 86, 106));
        jButton1.setText("Modificar");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 120, 40));

        jButton2.setBackground(new java.awt.Color(208, 135, 112));
        jButton2.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(76, 86, 106));
        jButton2.setText("Eliminar");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 120, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
