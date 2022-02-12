/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.admin.container.content;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;

/**
 *
 * @author mrmango
 */
public class AdminDashboardMain extends javax.swing.JPanel {

    /**
     * Creates new form AdminDashboardMain
     */
    public AdminDashboardMain() {
        initComponents();
        jScrollPane1.setBorder(BorderFactory.createEmptyBorder());
        jScrollPane1.getVerticalScrollBar().setPreferredSize(new Dimension(0, 0));
        jScrollPane2.setBorder(BorderFactory.createEmptyBorder());
        jScrollPane2.getVerticalScrollBar().setPreferredSize(new Dimension(0, 0));
        tblSalesResume.getTableHeader().setFont(new java.awt.Font("Roboto Medium", 0, 14));
        tblCustomerResume.getTableHeader().setFont(new java.awt.Font("Roboto Medium", 0, 14));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSalesResume = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalesResume = new javax.swing.JTable();
        pnlCustomersResume = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCustomerResume = new javax.swing.JTable();
        title1 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 239, 244));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSalesResume.setBackground(new java.awt.Color(229, 233, 240));
        pnlSalesResume.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSalesResume.setAutoCreateRowSorter(true);
        tblSalesResume.setBackground(new java.awt.Color(229, 233, 240));
        tblSalesResume.setFont(new java.awt.Font("Roboto Light", 0, 13)); // NOI18N
        tblSalesResume.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSalesResume.setGridColor(new java.awt.Color(229, 233, 240));
        tblSalesResume.setRowHeight(35);
        tblSalesResume.setSelectionBackground(new java.awt.Color(235, 203, 139));
        tblSalesResume.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblSalesResume);
        tblSalesResume.getTableHeader().setOpaque(false);
        tblSalesResume.getTableHeader().setBackground(new java.awt.Color(229, 233, 240));

        pnlSalesResume.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 340, 390));

        add(pnlSalesResume, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 430));

        pnlCustomersResume.setBackground(new java.awt.Color(229, 233, 240));
        pnlCustomersResume.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCustomerResume.setBackground(new java.awt.Color(229, 233, 240));
        tblCustomerResume.setFont(new java.awt.Font("Roboto Light", 0, 13)); // NOI18N
        tblCustomerResume.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad"
            }
        ));
        tblCustomerResume.setFocusable(false);
        tblCustomerResume.setRowHeight(35);
        tblCustomerResume.setSelectionBackground(new java.awt.Color(235, 203, 139));
        tblCustomerResume.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCustomerResume.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblCustomerResume);
        tblCustomerResume.getTableHeader().setOpaque(false);
        tblCustomerResume.getTableHeader().setBackground(new java.awt.Color(229, 233, 240));

        pnlCustomersResume.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 340, 390));

        add(pnlCustomersResume, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 400, 430));

        title1.setBackground(new java.awt.Color(76, 86, 106));
        title1.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        title1.setForeground(new java.awt.Color(76, 86, 106));
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("Ventas de Hoy");
        add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 150, 20));

        title2.setBackground(new java.awt.Color(76, 86, 106));
        title2.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        title2.setForeground(new java.awt.Color(76, 86, 106));
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("Clientes Habituales");
        add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 150, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlCustomersResume;
    private javax.swing.JPanel pnlSalesResume;
    private javax.swing.JTable tblCustomerResume;
    private javax.swing.JTable tblSalesResume;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    // End of variables declaration//GEN-END:variables
}
