/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.dev.panels;

import com.dev.config.DBConnection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author mrmango
 */
public class AdminEmployeeMain extends javax.swing.JPanel {

    DBConnection ctn = new DBConnection();
    Connection cn;
    Statement st;
    ResultSet rs;

    public AdminEmployeeMain() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtNui = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 239, 244));
        setPreferredSize(new java.awt.Dimension(940, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(236, 239, 244));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/account.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 86, 106));
        jLabel1.setText("EMPLOYEE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(229, 233, 240));
        jPanel2.setForeground(new java.awt.Color(76, 86, 106));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(76, 86, 106));
        jLabel3.setText("Contraseña:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(76, 86, 106));
        jLabel4.setText("Apellido:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(76, 86, 106));
        jLabel5.setText("Nombre:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(76, 86, 106));
        jLabel6.setText("Direccion:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(76, 86, 106));
        jLabel7.setText("Telefono:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(76, 86, 106));
        jLabel8.setText("Email:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(76, 86, 106));
        jLabel9.setText("NUI:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        txtPassword.setBackground(new java.awt.Color(236, 239, 244));
        txtPassword.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtPassword.setBorder(null);
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 110, 22));

        txtName.setBackground(new java.awt.Color(236, 239, 244));
        txtName.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtName.setBorder(null);
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 110, 22));

        txtLastName.setBackground(new java.awt.Color(236, 239, 244));
        txtLastName.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtLastName.setBorder(null);
        jPanel2.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 110, 22));

        txtNui.setBackground(new java.awt.Color(236, 239, 244));
        txtNui.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtNui.setBorder(null);
        jPanel2.add(txtNui, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 110, 22));

        txtAddress.setBackground(new java.awt.Color(236, 239, 244));
        txtAddress.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtAddress.setBorder(null);
        jPanel2.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 110, 22));

        txtPhone.setBackground(new java.awt.Color(236, 239, 244));
        txtPhone.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtPhone.setBorder(null);
        jPanel2.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 110, 22));

        txtEmail.setBackground(new java.awt.Color(236, 239, 244));
        txtEmail.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtEmail.setBorder(null);
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 110, 22));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 750, 320));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(76, 86, 106));
        jLabel10.setText("Agregar Empleados:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        jLabel11.setBackground(new java.awt.Color(143, 188, 187));
        jLabel11.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(76, 86, 106));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Agregar");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.setOpaque(true);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 120, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        addEmployee();
    }//GEN-LAST:event_jLabel11MouseClicked

    public void addEmployee() {
        String name = txtName.getText();
        String lastName = txtLastName.getText();
        String nui = txtNui.getText();
        String address = txtAddress.getText();
        String phone = txtPhone.getText();
        String email = txtEmail.getText();
        String password = txtPassword.getText();
        String sql = "insert into employee (nui,firstname,lastname,address,phone,mail,password,admin_idAdmin) values ('" + nui + "','" + name + "','" + lastName + "','" + address + "','" + phone + "','" + email + "','" + password + "', 1)";
        try {
            cn = ctn.getConnection();
            st = cn.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Usuario Agregado");
            clearTxtFields();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    public void clearTxtFields(){
        txtName.setText("");
        txtLastName.setText("");
        txtPhone.setText("");
        txtNui.setText("");
        txtAddress.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNui;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
