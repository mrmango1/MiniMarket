/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.admin.container;

import com.admin.container.content.AdminSalesMain;
import com.admin.container.content.AdminSalesSearch;
import com.functions.Design;

/**
 *
 * @author mrmango
 */
public class AdminSales extends javax.swing.JPanel {

    /**
     * Creates new form AdminEmployeeMain
     */
    public AdminSales() {
        initComponents();
        Design.panelChange(pnlContent,new AdminSalesMain());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();
        btnDetails = new javax.swing.JButton();
        pnlBack = new javax.swing.JPanel();
        btnBack = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 239, 244));
        setPreferredSize(new java.awt.Dimension(940, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setBackground(new java.awt.Color(236, 239, 244));
        Title.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shopping_car.png"))); // NOI18N
        Title.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel4.setBackground(new java.awt.Color(46, 52, 64));
        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(46, 52, 64));
        jLabel4.setText("SALES");
        Title.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 6, -1, 36));

        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 15, -1, -1));

        pnlContent.setBackground(new java.awt.Color(236, 239, 244));
        pnlContent.setPreferredSize(new java.awt.Dimension(840, 500));
        pnlContent.setLayout(new javax.swing.BoxLayout(pnlContent, javax.swing.BoxLayout.LINE_AXIS));
        add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 840, 500));

        btnDetails.setBackground(new java.awt.Color(143, 188, 187));
        btnDetails.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btnDetails.setForeground(new java.awt.Color(76, 86, 106));
        btnDetails.setText("Detalle");
        btnDetails.setBorder(null);
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });
        add(btnDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 120, 40));

        pnlBack.setBackground(new java.awt.Color(236, 239, 244));
        pnlBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back_arrow.png"))); // NOI18N
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        pnlBack.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(pnlBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 40, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        Design.panelChange(pnlContent,new AdminSalesSearch());
    }//GEN-LAST:event_btnDetailsActionPerformed

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        Design.panelChange(pnlContent, new AdminSalesMain());
        btnDetails.setVisible(true);
        pnlBack.setVisible(false);
    }//GEN-LAST:event_btnBackMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel Title;
    private static javax.swing.JLabel btnBack;
    private static javax.swing.JButton btnDetails;
    private static javax.swing.JLabel jLabel3;
    private static javax.swing.JLabel jLabel4;
    private static javax.swing.JPanel pnlBack;
    private static javax.swing.JPanel pnlContent;
    // End of variables declaration//GEN-END:variables
}