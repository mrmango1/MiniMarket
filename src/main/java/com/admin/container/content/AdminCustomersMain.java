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

        panelContenidoClientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pnlSearch = new java.awt.Panel();
        id = new javax.swing.JLabel();
        search_icon = new javax.swing.JLabel();
        search = new javax.swing.JTextField();

        setBackground(new java.awt.Color(236, 239, 244));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelContenidoClientes.setBackground(new java.awt.Color(229, 233, 240));
        panelContenidoClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(229, 233, 240));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "NUI", "Direccion", "Telefono", "Email"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
        }
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new java.awt.Color(229, 233, 240));

        panelContenidoClientes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 700, 350));

        add(panelContenidoClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 780, 400));

        pnlSearch.setBackground(new java.awt.Color(236, 239, 244));
        pnlSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        id.setText("ID");
        pnlSearch.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 20, 30));

        search_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        pnlSearch.add(search_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 20, 30));

        search.setBackground(new java.awt.Color(136, 192, 208));
        search.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        search.setBorder(null);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        pnlSearch.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 140, 30));

        add(pnlSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 180, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel id;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelContenidoClientes;
    private java.awt.Panel pnlSearch;
    private javax.swing.JTextField search;
    private javax.swing.JLabel search_icon;
    // End of variables declaration//GEN-END:variables
}