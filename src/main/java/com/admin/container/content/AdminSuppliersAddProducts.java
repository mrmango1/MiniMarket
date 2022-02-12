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
public class AdminSuppliersAddProducts extends javax.swing.JPanel {

    /**
     * Creates new form AdminSuppliersAddProducts
     */
    public AdminSuppliersAddProducts() {
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
        lblName = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblPvp = new javax.swing.JLabel();
        lblDiscount = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtPvp = new javax.swing.JTextField();
        txtDiscount = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        btnAddProduct = new javax.swing.JButton();

        setBackground(new java.awt.Color(236, 239, 244));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContent.setBackground(new java.awt.Color(236, 239, 244));
        pnlContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setBackground(new java.awt.Color(76, 86, 106));
        lblName.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        lblName.setForeground(new java.awt.Color(76, 86, 106));
        lblName.setText("Nombre:");
        pnlContent.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, 35));

        lblAmount.setBackground(new java.awt.Color(76, 86, 106));
        lblAmount.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        lblAmount.setForeground(new java.awt.Color(76, 86, 106));
        lblAmount.setText("Cantidad:");
        pnlContent.add(lblAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, 35));

        lblPrice.setBackground(new java.awt.Color(76, 86, 106));
        lblPrice.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(76, 86, 106));
        lblPrice.setText("Precio:");
        pnlContent.add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, 35));

        lblPvp.setBackground(new java.awt.Color(76, 86, 106));
        lblPvp.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        lblPvp.setForeground(new java.awt.Color(76, 86, 106));
        lblPvp.setText("PVP:");
        pnlContent.add(lblPvp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, 35));

        lblDiscount.setBackground(new java.awt.Color(76, 86, 106));
        lblDiscount.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        lblDiscount.setForeground(new java.awt.Color(76, 86, 106));
        lblDiscount.setText("Descuento:");
        pnlContent.add(lblDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, 35));

        lblDescription.setBackground(new java.awt.Color(76, 86, 106));
        lblDescription.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(76, 86, 106));
        lblDescription.setText("Descripción:");
        pnlContent.add(lblDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, 35));

        txtName.setBackground(new java.awt.Color(229, 233, 240));
        txtName.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txtName.setForeground(new java.awt.Color(130, 147, 181));
        txtName.setBorder(null);
        pnlContent.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 190, 35));
        txtName.setBorder(BorderFactory.createCompoundBorder(txtName.getBorder(),BorderFactory.createEmptyBorder(7, 10, 7, 10)));

        txtAmount.setBackground(new java.awt.Color(229, 233, 240));
        txtAmount.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txtAmount.setForeground(new java.awt.Color(130, 147, 181));
        txtAmount.setBorder(null);
        pnlContent.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 190, 35));
        txtAmount.setBorder(BorderFactory.createCompoundBorder(txtAmount.getBorder(),BorderFactory.createEmptyBorder(7, 10, 7, 10)));

        txtPrice.setBackground(new java.awt.Color(229, 233, 240));
        txtPrice.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(130, 147, 181));
        txtPrice.setBorder(null);
        pnlContent.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 190, 35));
        txtPrice.setBorder(BorderFactory.createCompoundBorder(txtPrice.getBorder(),BorderFactory.createEmptyBorder(7, 10, 7, 10)));

        txtPvp.setBackground(new java.awt.Color(229, 233, 240));
        txtPvp.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txtPvp.setForeground(new java.awt.Color(130, 147, 181));
        txtPvp.setBorder(null);
        pnlContent.add(txtPvp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 190, 35));
        txtPvp.setBorder(BorderFactory.createCompoundBorder(txtPvp.getBorder(),BorderFactory.createEmptyBorder(7, 10, 7, 10)));

        txtDiscount.setBackground(new java.awt.Color(229, 233, 240));
        txtDiscount.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txtDiscount.setForeground(new java.awt.Color(130, 147, 181));
        txtDiscount.setBorder(null);
        pnlContent.add(txtDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 190, 35));
        txtDiscount.setBorder(BorderFactory.createCompoundBorder(txtDiscount.getBorder(),BorderFactory.createEmptyBorder(7, 10, 7, 10)));

        txtDescription.setBackground(new java.awt.Color(229, 233, 240));
        txtDescription.setColumns(20);
        txtDescription.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        txtDescription.setForeground(new java.awt.Color(130, 147, 181));
        txtDescription.setRows(5);
        txtDescription.setBorder(null);
        jScrollPane1.setViewportView(txtDescription);
        txtDescription.setBorder(BorderFactory.createCompoundBorder(txtDescription.getBorder(),BorderFactory.createEmptyBorder(7, 10, 7, 10)));

        pnlContent.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 290, 130));
        jScrollPane1.setBorder(BorderFactory.createEmptyBorder());
        jScrollPane1.getVerticalScrollBar().setPreferredSize( new Dimension(0,0) );
        jScrollPane1.getHorizontalScrollBar().setPreferredSize( new Dimension(0,0) );

        add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 480, 430));

        btnAddProduct.setBackground(new java.awt.Color(163, 190, 140));
        btnAddProduct.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btnAddProduct.setForeground(new java.awt.Color(76, 86, 106));
        btnAddProduct.setText("Agregar");
        btnAddProduct.setBorder(null);
        btnAddProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnAddProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 120, 40));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblPvp;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtPvp;
    // End of variables declaration//GEN-END:variables
}
