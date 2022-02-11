/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mainPanel;

import com.admin.AdminMain;
import com.employee.EmployeeMain;
import com.functions.DBManagement;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author mrmango
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */

    public Login() {
        initComponents();
        logoQmet();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBg = new javax.swing.JPanel();
        pnlTittle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblTitleIcon = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        inptContent = new javax.swing.JPanel();
        icnLock = new javax.swing.JLabel();
        icnUser = new javax.swing.JLabel();
        pnlUser = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        pnlPassword = new javax.swing.JPanel();
        pwdUser = new javax.swing.JPasswordField();
        pnlLogo = new javax.swing.JPanel();
        cbViewPwd = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(236, 239, 244));

        pnlBg.setBackground(new java.awt.Color(236, 239, 244));
        pnlBg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTittle.setBackground(new java.awt.Color(236, 239, 244));
        pnlTittle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(76, 86, 106));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("LOGIN");
        pnlTittle.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 60));

        lblTitleIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store.png"))); // NOI18N
        pnlTittle.add(lblTitleIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 160, 130));

        pnlBg.add(pnlTittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 180, 240));

        jButton1.setBackground(new java.awt.Color(76, 86, 106));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(229, 229, 229));
        jButton1.setText("Ingresar");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        pnlBg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, 120, 40));

        inptContent.setBackground(new java.awt.Color(236, 239, 244));
        inptContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icnLock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lock.png"))); // NOI18N
        inptContent.add(icnLock, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        icnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/account.png"))); // NOI18N
        inptContent.add(icnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        pnlUser.setBackground(new java.awt.Color(229, 233, 240));
        pnlUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setBackground(new java.awt.Color(229, 233, 240));
        txtUser.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        txtUser.setForeground(new java.awt.Color(130, 147, 181));
        txtUser.setText("usuario");
        txtUser.setBorder(null);
        txtUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        pnlUser.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, 170, 20));

        inptContent.add(pnlUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 190, 35));

        pnlPassword.setBackground(new java.awt.Color(229, 233, 240));
        pnlPassword.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pwdUser.setBackground(new java.awt.Color(229, 233, 240));
        pwdUser.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        pwdUser.setForeground(new java.awt.Color(130, 147, 181));
        pwdUser.setText("password");
        pwdUser.setBorder(null);
        pwdUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwdUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwdUserFocusLost(evt);
            }
        });
        pnlPassword.add(pwdUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, 170, 20));

        inptContent.add(pnlPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 190, 35));

        pnlBg.add(inptContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 260, 180));

        pnlLogo.setBackground(new java.awt.Color(236, 239, 244));

        javax.swing.GroupLayout pnlLogoLayout = new javax.swing.GroupLayout(pnlLogo);
        pnlLogo.setLayout(pnlLogoLayout);
        pnlLogoLayout.setHorizontalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        pnlLogoLayout.setVerticalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        pnlBg.add(pnlLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 300, 190));

        cbViewPwd.setBackground(new java.awt.Color(229, 233, 240));
        cbViewPwd.setBorder(null);
        cbViewPwd.setOpaque(true);
        cbViewPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbViewPwdActionPerformed(evt);
            }
        });
        pnlBg.add(cbViewPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBg, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        txtUser.setText("");
    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost

    }//GEN-LAST:event_txtUserFocusLost

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void pwdUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdUserFocusGained
        pwdUser.setText("");
    }//GEN-LAST:event_pwdUserFocusGained

    private void pwdUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdUserFocusLost

    }//GEN-LAST:event_pwdUserFocusLost

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        AdminMain adminMain = new AdminMain();
        EmployeeMain employeeMain = new EmployeeMain();
        if(DBManagement.login(txtUser.getText(), pwdUser.getText())==1){
            adminMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            adminMain.setUserName(DBManagement.getUserName());
            adminMain.setVisible(true);
            dispose();
        }
        else if(DBManagement.login(txtUser.getText(), pwdUser.getText())==2){
            employeeMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            employeeMain.setUserName(DBManagement.getUserName());
            employeeMain.setVisible(true);
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void cbViewPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbViewPwdActionPerformed
        if(cbViewPwd.isSelected()){
            pwdUser.setEchoChar((char)0);
        }else{
            pwdUser.setEchoChar('*');
        }
    }//GEN-LAST:event_cbViewPwdActionPerformed
    public void logoQmet() {
        JLabel lgQmet = new JLabel();
        lgQmet.setBounds(0, 0, 280, 140);
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Logo.png"));
        lgQmet.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(lgQmet.getWidth(), lgQmet.getHeight(), Image.SCALE_SMOOTH)));
        pnlLogo.add(lgQmet);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JCheckBox cbViewPwd;
    private static javax.swing.JLabel icnLock;
    private static javax.swing.JLabel icnUser;
    private static javax.swing.JPanel inptContent;
    private static javax.swing.JButton jButton1;
    private static javax.swing.JLabel lblTitle;
    private static javax.swing.JLabel lblTitleIcon;
    private static javax.swing.JPanel pnlBg;
    private static javax.swing.JPanel pnlLogo;
    private static javax.swing.JPanel pnlPassword;
    private static javax.swing.JPanel pnlTittle;
    private static javax.swing.JPanel pnlUser;
    private static javax.swing.JPasswordField pwdUser;
    private static javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
