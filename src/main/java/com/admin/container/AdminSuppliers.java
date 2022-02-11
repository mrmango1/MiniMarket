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

        Title = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();
        btnBack = new javax.swing.JLabel();
        btnAddSupplier = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAddProducts = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 239, 244));
        setPreferredSize(new java.awt.Dimension(940, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setBackground(new java.awt.Color(236, 239, 244));
        Title.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supplier.png"))); // NOI18N
        Title.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -4, 40, 50));

        jLabel4.setBackground(new java.awt.Color(46, 52, 64));
        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(46, 52, 64));
        jLabel4.setText("SUPPLIERS");
        Title.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 6, -1, 36));

        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 15, -1, -1));

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

        btnAddSupplier.setBackground(new java.awt.Color(236, 239, 244));
        btnAddSupplier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddSupplierMouseClicked(evt);
            }
        });
        btnAddSupplier.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_person.png"))); // NOI18N
        btnAddSupplier.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 20));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(46, 52, 64));
        jLabel6.setText("Añadir Proveedores");
        btnAddSupplier.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 20));

        add(btnAddSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 180, 20));

        btnAddProducts.setBackground(new java.awt.Color(236, 239, 244));
        btnAddProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddProductsMouseClicked(evt);
            }
        });
        btnAddProducts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_person.png"))); // NOI18N
        btnAddProducts.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 20));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(46, 52, 64));
        jLabel10.setText("Añadir Productos");
        btnAddProducts.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 20));

        add(btnAddProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 180, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        btnAddSupplier.setVisible(true);
        btnBack.setVisible(false);
        btnAddProducts.setVisible(true);
        Design.panelChange(pnlContent, new AdminSupplierMain());
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnAddSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddSupplierMouseClicked
        btnBack.setVisible(true);
        btnAddSupplier.setVisible(false);
        Design.panelChange(pnlContent, new AdminSuppliersAddSuppliers());
    }//GEN-LAST:event_btnAddSupplierMouseClicked

    private void btnAddProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddProductsMouseClicked
        Design.panelChange(pnlContent, new AdminSuppliersAddProducts());
        btnAddProducts.setVisible(false);
        btnAddSupplier.setVisible(false);
        btnBack.setVisible(true);
    }//GEN-LAST:event_btnAddProductsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel Title;
    private static javax.swing.JPanel btnAddProducts;
    private static javax.swing.JPanel btnAddSupplier;
    private static javax.swing.JLabel btnBack;
    private static javax.swing.JLabel jLabel10;
    private static javax.swing.JLabel jLabel3;
    private static javax.swing.JLabel jLabel4;
    private static javax.swing.JLabel jLabel5;
    private static javax.swing.JLabel jLabel6;
    private static javax.swing.JLabel jLabel9;
    private static javax.swing.JPanel pnlContent;
    // End of variables declaration//GEN-END:variables
}
