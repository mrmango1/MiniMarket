/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.admin.container;
import com.admin.container.content.AdminSupplierMain;
import com.admin.container.content.AdminSuppliersAddProducts;
import com.admin.container.content.AdminSuppliersAddSuppliers;
import com.functions.Design;

/**
 *
 * @author mrmango
 */
public class AdminSuppliers extends javax.swing.JPanel {

    /**
     * Creates new form AdminEmployeeMain
     */
    public AdminSuppliers() {
        initComponents();
        Design.panelChange(pnlContent, new AdminSupplierMain());
        btnBack.setVisible(false);
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
        btnBack = new javax.swing.JLabel();
        btnAddSupplier = new javax.swing.JLabel();
        btnAddProducts = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 239, 244));
        setPreferredSize(new java.awt.Dimension(940, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContent.setBackground(new java.awt.Color(236, 239, 244));
        pnlContent.setPreferredSize(new java.awt.Dimension(840, 500));
        pnlContent.setLayout(new javax.swing.BoxLayout(pnlContent, javax.swing.BoxLayout.LINE_AXIS));
        add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 840, 500));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back_arrow.png"))); // NOI18N
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 40, -1));

        btnAddSupplier.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnAddSupplier.setForeground(new java.awt.Color(46, 52, 64));
        btnAddSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_person.png"))); // NOI18N
        btnAddSupplier.setText("Añadir Proveedores");
        btnAddSupplier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddSupplierMouseClicked(evt);
            }
        });
        add(btnAddSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 10, 155, 30));

        btnAddProducts.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnAddProducts.setForeground(new java.awt.Color(46, 52, 64));
        btnAddProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        btnAddProducts.setText("Añadir Productos");
        btnAddProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddProductsMouseClicked(evt);
            }
        });
        add(btnAddProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 140, 30));

        jLabel4.setBackground(new java.awt.Color(46, 52, 64));
        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(46, 52, 64));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supplier.png"))); // NOI18N
        jLabel4.setText("SUPPLIERS");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 20, 130, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        btnAddSupplier.setVisible(true);
        btnBack.setVisible(false);
        btnAddProducts.setVisible(true);
        Design.panelChange(pnlContent, new AdminSupplierMain());
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnAddSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddSupplierMouseClicked
        btnAddSupplier.setVisible(false);
        btnBack.setVisible(true);
        btnAddProducts.setVisible(true);
        Design.panelChange(pnlContent, new AdminSuppliersAddSuppliers());
    }//GEN-LAST:event_btnAddSupplierMouseClicked

    private void btnAddProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddProductsMouseClicked
        btnAddSupplier.setVisible(true);
        btnBack.setVisible(true);
        btnAddProducts.setVisible(false);
        Design.panelChange(pnlContent, new AdminSuppliersAddProducts());
    }//GEN-LAST:event_btnAddProductsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel btnAddProducts;
    private static javax.swing.JLabel btnAddSupplier;
    private static javax.swing.JLabel btnBack;
    private static javax.swing.JLabel jLabel4;
    private static javax.swing.JPanel pnlContent;
    // End of variables declaration//GEN-END:variables
}
