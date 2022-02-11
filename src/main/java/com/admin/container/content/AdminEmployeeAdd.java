/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.admin.container.content;

import com.functions.DBManagement;
import javax.swing.JOptionPane;

/**
 *
 * @author mrmango
 */
public class AdminEmployeeAdd extends javax.swing.JPanel {

    public AdminEmployeeAdd() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNui = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnAddEmployee = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 239, 244));
        setPreferredSize(new java.awt.Dimension(840, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContent.setBackground(new java.awt.Color(229, 233, 240));
        pnlContent.setForeground(new java.awt.Color(76, 86, 106));
        pnlContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(76, 86, 106));
        jLabel3.setText("Contraseña:");
        pnlContent.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(76, 86, 106));
        jLabel4.setText("Apellido:");
        pnlContent.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(76, 86, 106));
        jLabel5.setText("Nombre:");
        pnlContent.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(76, 86, 106));
        jLabel6.setText("Direccion:");
        pnlContent.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(76, 86, 106));
        jLabel7.setText("Telefono:");
        pnlContent.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(76, 86, 106));
        jLabel8.setText("Email:");
        pnlContent.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(76, 86, 106));
        jLabel9.setText("NUI:");
        pnlContent.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        txtNui.setBackground(new java.awt.Color(216, 222, 233));
        txtNui.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtNui.setBorder(null);
        pnlContent.add(txtNui, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 190, 22));

        txtName.setBackground(new java.awt.Color(216, 222, 233));
        txtName.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtName.setBorder(null);
        pnlContent.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 190, 22));

        txtLastName.setBackground(new java.awt.Color(216, 222, 233));
        txtLastName.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtLastName.setBorder(null);
        pnlContent.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 190, 22));

        txtAddress.setBackground(new java.awt.Color(216, 222, 233));
        txtAddress.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtAddress.setBorder(null);
        pnlContent.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 190, 22));

        txtPhone.setBackground(new java.awt.Color(216, 222, 233));
        txtPhone.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtPhone.setBorder(null);
        pnlContent.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 190, 22));

        txtEmail.setBackground(new java.awt.Color(216, 222, 233));
        txtEmail.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtEmail.setBorder(null);
        pnlContent.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 190, 22));

        txtPassword.setBackground(new java.awt.Color(216, 222, 233));
        txtPassword.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtPassword.setBorder(null);
        pnlContent.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 190, 22));

        add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 800, 380));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(76, 86, 106));
        jLabel10.setText("Agregar Empleados:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        btnAddEmployee.setBackground(new java.awt.Color(143, 188, 187));
        btnAddEmployee.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btnAddEmployee.setForeground(new java.awt.Color(76, 86, 106));
        btnAddEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAddEmployee.setText("Agregar");
        btnAddEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddEmployee.setOpaque(true);
        btnAddEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddEmployeeMouseClicked(evt);
            }
        });
        add(btnAddEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 120, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddEmployeeMouseClicked
        DBManagement.getTxtFromTxtFields(pnlContent.getComponents());
        addEmployee();
    }//GEN-LAST:event_btnAddEmployeeMouseClicked

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
    private javax.swing.JLabel btnAddEmployee;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNui;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
