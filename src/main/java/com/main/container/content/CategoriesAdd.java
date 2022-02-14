/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.main.container.content;

import com.functions.DBManagement;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author mrmango
 */
public class CategoriesAdd extends javax.swing.JPanel {

    /**
     * Creates new form AdminSuppliersAddProducts
     */
    public CategoriesAdd() {
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
        lblDescription = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
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
        pnlContent.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 60, -1, 35));

        lblDescription.setBackground(new java.awt.Color(76, 86, 106));
        lblDescription.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(76, 86, 106));
        lblDescription.setText("Descripción:");
        pnlContent.add(lblDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 180, -1, 35));

        txtName.setBackground(new java.awt.Color(229, 233, 240));
        txtName.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txtName.setForeground(new java.awt.Color(130, 147, 181));
        txtName.setBorder(null);
        pnlContent.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 60, 200, 35));
        txtName.setBorder(BorderFactory.createCompoundBorder(txtName.getBorder(),BorderFactory.createEmptyBorder(7, 10, 7, 10)));

        txtDescription.setBackground(new java.awt.Color(229, 233, 240));
        txtDescription.setColumns(20);
        txtDescription.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        txtDescription.setForeground(new java.awt.Color(130, 147, 181));
        txtDescription.setLineWrap(true);
        txtDescription.setRows(5);
        txtDescription.setWrapStyleWord(true);
        txtDescription.setBorder(null);
        jScrollPane1.setViewportView(txtDescription);
        txtDescription.setBorder(BorderFactory.createCompoundBorder(txtDescription.getBorder(),BorderFactory.createEmptyBorder(7, 10, 7, 10)));

        pnlContent.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 180, 200, 190));
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
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });
        add(btnAddProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 120, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        DBManagement.getTxtFromTxtFields(pnlContent.getComponents());
        addProducts();
    }//GEN-LAST:event_btnAddProductActionPerformed

    public void addProducts() {
        String sqlInsert = "insert into product (name,stock,price,pvp,discount)";
        String sqlInto = DBManagement.getTxtFromTxtFields(pnlContent.getComponents())+");";
        String sql = sqlInsert + sqlInto;
        System.out.println(sql);
        if (sqlInto.equals(");")) {
            JOptionPane.showMessageDialog(null, "Rellene los campos necesarios");
        } else {
            DBManagement.pushData2DB(sql, "Producto Agregado");
            DBManagement.clearTxtFields(pnlContent.getComponents());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblName;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
