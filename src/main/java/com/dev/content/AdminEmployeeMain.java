/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.dev.content;

import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableCellRenderer;
/**
 *
 * @author mrmango
 */
public class AdminEmployeeMain extends javax.swing.JPanel {

    /**
     * Creates new form AdminEmployeeMain
     */
    final DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
    AdminEmployeeAdd add = new AdminEmployeeAdd();
    public AdminEmployeeMain() {
        initComponents();jTable1.setFillsViewportHeight(true);
        jScrollPane1.setBorder(BorderFactory.createEmptyBorder());
        renderer.setBorder(null);
        renderer.setHorizontalAlignment(0);
        jTable1.getTableHeader().setDefaultRenderer(renderer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(236, 239, 244));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(229, 233, 240));
        jTable1.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "NUI", "Dirección", "Telefono", "Email"
            }
        ));
        jTable1.setCellSelectionEnabled(true);
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(216, 222, 233));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(129, 161, 193));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowGrid(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new java.awt.Color(229, 233, 240));

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 820, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
