/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.admin.container.content;

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

        jPanel2 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        nameTextField1 = new javax.swing.JTextField();
        pvp = new javax.swing.JLabel();
        priceTextField = new javax.swing.JTextField();
        Discount = new javax.swing.JLabel();
        discountTextField2 = new javax.swing.JTextField();
        price1 = new javax.swing.JLabel();
        quantityTextField3 = new javax.swing.JTextField();
        quantity2 = new javax.swing.JLabel();
        pvpTextField3 = new javax.swing.JTextField();
        Discount1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea1 = new javax.swing.JTextArea();
        AgregarProductos = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(236, 239, 244));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(229, 233, 240));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setBackground(new java.awt.Color(76, 86, 106));
        name.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        name.setForeground(new java.awt.Color(76, 86, 106));
        name.setText("Nombre:");
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        nameTextField1.setBackground(new java.awt.Color(236, 239, 244));
        nameTextField1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nameTextField1.setBorder(null);
        jPanel2.add(nameTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 190, 22));

        pvp.setBackground(new java.awt.Color(76, 86, 106));
        pvp.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        pvp.setForeground(new java.awt.Color(76, 86, 106));
        pvp.setText("PVP:");
        jPanel2.add(pvp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        priceTextField.setBackground(new java.awt.Color(236, 239, 244));
        priceTextField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        priceTextField.setBorder(null);
        jPanel2.add(priceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 190, 22));

        Discount.setBackground(new java.awt.Color(76, 86, 106));
        Discount.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        Discount.setForeground(new java.awt.Color(76, 86, 106));
        Discount.setText("Descripción:");
        jPanel2.add(Discount, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        discountTextField2.setBackground(new java.awt.Color(236, 239, 244));
        discountTextField2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        discountTextField2.setBorder(null);
        jPanel2.add(discountTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 190, 22));

        price1.setBackground(new java.awt.Color(76, 86, 106));
        price1.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        price1.setForeground(new java.awt.Color(76, 86, 106));
        price1.setText("Precio:");
        jPanel2.add(price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        quantityTextField3.setBackground(new java.awt.Color(236, 239, 244));
        quantityTextField3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        quantityTextField3.setBorder(null);
        jPanel2.add(quantityTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 190, 22));

        quantity2.setBackground(new java.awt.Color(76, 86, 106));
        quantity2.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        quantity2.setForeground(new java.awt.Color(76, 86, 106));
        quantity2.setText("Cantidad:");
        jPanel2.add(quantity2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        pvpTextField3.setBackground(new java.awt.Color(236, 239, 244));
        pvpTextField3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        pvpTextField3.setBorder(null);
        jPanel2.add(pvpTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 190, 22));

        Discount1.setBackground(new java.awt.Color(76, 86, 106));
        Discount1.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        Discount1.setForeground(new java.awt.Color(76, 86, 106));
        Discount1.setText("Descuento:");
        jPanel2.add(Discount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        descriptionTextArea1.setBackground(new java.awt.Color(236, 239, 244));
        descriptionTextArea1.setColumns(20);
        descriptionTextArea1.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        descriptionTextArea1.setRows(5);
        descriptionTextArea1.setBorder(null);
        jScrollPane1.setViewportView(descriptionTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 240, 130));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 32, 780, 400));

        AgregarProductos.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        AgregarProductos.setForeground(new java.awt.Color(76, 86, 106));
        AgregarProductos.setText("Agregar Productos");
        AgregarProductos.setToolTipText("");
        add(AgregarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));

        AddButton.setBackground(new java.awt.Color(143, 188, 187));
        AddButton.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        AddButton.setForeground(new java.awt.Color(76, 86, 106));
        AddButton.setText("Agregar");
        AddButton.setBorder(null);
        add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 120, 40));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel AgregarProductos;
    private javax.swing.JLabel Discount;
    private javax.swing.JLabel Discount1;
    private javax.swing.JTextArea descriptionTextArea1;
    private javax.swing.JTextField discountTextField2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameTextField1;
    private javax.swing.JLabel price1;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JLabel pvp;
    private javax.swing.JTextField pvpTextField3;
    private javax.swing.JLabel quantity2;
    private javax.swing.JTextField quantityTextField3;
    // End of variables declaration//GEN-END:variables
}
