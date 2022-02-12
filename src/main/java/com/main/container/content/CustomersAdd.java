/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.main.container.content;

import com.functions.DBManagement;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;


/**
 *
 * @author mrmango
 */
public class CustomersAdd extends javax.swing.JPanel {

    public CustomersAdd() {
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
        lblLastName = new javax.swing.JLabel();
        lblNui = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtNui = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnAddCustomer = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 239, 244));
        setPreferredSize(new java.awt.Dimension(840, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContent.setBackground(new java.awt.Color(236, 239, 244));
        pnlContent.setForeground(new java.awt.Color(76, 86, 106));
        pnlContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        lblName.setForeground(new java.awt.Color(76, 86, 106));
        lblName.setText("Nombre:");
        pnlContent.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, 35));

        lblLastName.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(76, 86, 106));
        lblLastName.setText("Apellido:");
        pnlContent.add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, 35));

        lblNui.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        lblNui.setForeground(new java.awt.Color(76, 86, 106));
        lblNui.setText("NUI:");
        pnlContent.add(lblNui, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, 35));

        lblAddress.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(76, 86, 106));
        lblAddress.setText("Direccion:");
        pnlContent.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, 35));

        lblPhone.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(76, 86, 106));
        lblPhone.setText("Telefono:");
        pnlContent.add(lblPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, 35));

        lblEmail.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(76, 86, 106));
        lblEmail.setText("Email:");
        pnlContent.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, 35));

        txtNui.setBackground(new java.awt.Color(229, 233, 240));
        txtNui.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        txtNui.setForeground(new java.awt.Color(130, 147, 181));
        txtNui.setBorder(null);
        pnlContent.add(txtNui, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 190, 35));
        txtNui.setBorder(BorderFactory.createCompoundBorder(txtNui.getBorder(),BorderFactory.createEmptyBorder(7, 10, 7, 10)));

        txtName.setBackground(new java.awt.Color(229, 233, 240));
        txtName.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        txtName.setForeground(new java.awt.Color(130, 147, 181));
        txtName.setBorder(null);
        pnlContent.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 190, 35));
        txtName.setBorder(BorderFactory.createCompoundBorder(txtName.getBorder(),BorderFactory.createEmptyBorder(7, 10, 7, 10)));

        txtLastName.setBackground(new java.awt.Color(229, 233, 240));
        txtLastName.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        txtLastName.setForeground(new java.awt.Color(130, 147, 181));
        txtLastName.setBorder(null);
        pnlContent.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 190, 35));
        txtLastName.setBorder(BorderFactory.createCompoundBorder(txtLastName.getBorder(),BorderFactory.createEmptyBorder(7, 10, 7, 10)));

        txtAddress.setBackground(new java.awt.Color(229, 233, 240));
        txtAddress.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(130, 147, 181));
        txtAddress.setBorder(null);
        pnlContent.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 190, 35));
        txtAddress.setBorder(BorderFactory.createCompoundBorder(txtAddress.getBorder(),BorderFactory.createEmptyBorder(7, 10, 7, 10)));

        txtPhone.setBackground(new java.awt.Color(229, 233, 240));
        txtPhone.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        txtPhone.setForeground(new java.awt.Color(130, 147, 181));
        txtPhone.setBorder(null);
        pnlContent.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 190, 35));
        txtPhone.setBorder(BorderFactory.createCompoundBorder(txtPhone.getBorder(),BorderFactory.createEmptyBorder(7, 10, 7, 10)));

        txtEmail.setBackground(new java.awt.Color(229, 233, 240));
        txtEmail.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(130, 147, 181));
        txtEmail.setBorder(null);
        pnlContent.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 190, 35));
        txtEmail.setBorder(BorderFactory.createCompoundBorder(txtEmail.getBorder(),BorderFactory.createEmptyBorder(7, 10, 7, 10)));

        add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 460, 380));

        btnAddCustomer.setBackground(new java.awt.Color(163, 190, 140));
        btnAddCustomer.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btnAddCustomer.setForeground(new java.awt.Color(76, 86, 106));
        btnAddCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAddCustomer.setText("Agregar");
        btnAddCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddCustomer.setOpaque(true);
        btnAddCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddCustomerMouseClicked(evt);
            }
        });
        add(btnAddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 120, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCustomerMouseClicked
        DBManagement.getTxtFromTxtFields(pnlContent.getComponents());
        addEmployee();
    }//GEN-LAST:event_btnAddCustomerMouseClicked

    public void addEmployee() {
        String sqlInsert = "insert into employee (nui,firstname,lastname,address,phone,mail,password,idAdmin)";
        String sqlInto = DBManagement.getTxtFromTxtFields(pnlContent.getComponents())+ ",'1');";
        String sql=sqlInsert+sqlInto;
        if (DBManagement.getTxtFromTxtFields(pnlContent.getComponents()).equals("")) {
            JOptionPane.showMessageDialog(null, "Rellene los campos necesarios");
        } else {
            DBManagement.pushData2DB(sql, "Usuario Agregado");
        }
        DBManagement.clearTxtFields(pnlContent.getComponents());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAddCustomer;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNui;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNui;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}