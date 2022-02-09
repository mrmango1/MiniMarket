/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.dev.content;

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
        panelBusquedaID = new javax.swing.JPanel();
        textField1 = new java.awt.TextField();
        label1 = new java.awt.Label();

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

        panelContenidoClientes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 550, 210));

        add(panelContenidoClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 710, 330));

        panelBusquedaID.setBackground(new java.awt.Color(236, 239, 244));
        panelBusquedaID.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textField1.setBackground(new java.awt.Color(136, 192, 208));
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        panelBusquedaID.add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 200, 30));

        label1.setName("ID"); // NOI18N
        label1.setText("ID");
        panelBusquedaID.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        add(panelBusquedaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 280, 80));
    }// </editor-fold>//GEN-END:initComponents

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private javax.swing.JPanel panelBusquedaID;
    private javax.swing.JPanel panelContenidoClientes;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
