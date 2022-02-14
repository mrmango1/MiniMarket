/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.main.container;

import com.main.container.content.ProductsMain;
import com.main.container.content.ProductsAdd;
import com.functions.Design;
import com.main.container.content.CategoriesAdd;

/**
 *
 * @author mrmango
 */
public class Products extends javax.swing.JPanel {

    /**
     * Creates new form AdminEmployeeMain
     */
    boolean admin;
    boolean pnlCategories = false;

    public Products(boolean admin) {
        initComponents();
        this.admin = admin;
        if (!admin) {
            btnAddProducts.setVisible(false);
        }
        Design.panelChange(pnlContent, new ProductsMain(admin));
        btnBack.setVisible(false);
        btnAddCategories.setVisible(false);
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
        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JLabel();
        btnAddProducts = new javax.swing.JLabel();
        btnAddCategories = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 239, 244));
        setPreferredSize(new java.awt.Dimension(940, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContent.setBackground(new java.awt.Color(236, 239, 244));
        pnlContent.setPreferredSize(new java.awt.Dimension(840, 500));
        pnlContent.setLayout(new javax.swing.BoxLayout(pnlContent, javax.swing.BoxLayout.LINE_AXIS));
        add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 840, 500));

        lblTitle.setBackground(new java.awt.Color(46, 52, 64));
        lblTitle.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(46, 52, 64));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supplier.png"))); // NOI18N
        lblTitle.setText("PRODUCTOS");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 160, 30));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back_arrow.png"))); // NOI18N
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 25, 20, -1));

        btnAddProducts.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnAddProducts.setForeground(new java.awt.Color(46, 52, 64));
        btnAddProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        btnAddProducts.setText("Producto");
        btnAddProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddProductsMouseClicked(evt);
            }
        });
        add(btnAddProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(805, 22, 85, 26));

        btnAddCategories.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnAddCategories.setForeground(new java.awt.Color(46, 52, 64));
        btnAddCategories.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        btnAddCategories.setText("Categoria");
        btnAddCategories.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddCategories.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddCategoriesMouseClicked(evt);
            }
        });
        add(btnAddCategories, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 22, 95, 26));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        if (pnlCategories) {
            Design.panelChange(pnlContent, new ProductsAdd());
            pnlCategories = false;
            btnAddCategories.setVisible(true);
        } else {
            Design.panelChange(pnlContent, new ProductsMain(this.admin));
            btnBack.setVisible(false);
            btnAddProducts.setVisible(true);
            btnAddCategories.setVisible(false);
        }
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnAddProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddProductsMouseClicked
        btnBack.setVisible(true);
        btnAddProducts.setVisible(false);
        btnAddCategories.setVisible(true);
        Design.panelChange(pnlContent, new ProductsAdd());
    }//GEN-LAST:event_btnAddProductsMouseClicked

    private void btnAddCategoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCategoriesMouseClicked
        btnAddCategories.setVisible(false);
        Design.panelChange(pnlContent, new CategoriesAdd());
        pnlCategories = true;
    }//GEN-LAST:event_btnAddCategoriesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel btnAddCategories;
    private static javax.swing.JLabel btnAddProducts;
    private static javax.swing.JLabel btnBack;
    private static javax.swing.JLabel lblTitle;
    private static javax.swing.JPanel pnlContent;
    // End of variables declaration//GEN-END:variables
}
