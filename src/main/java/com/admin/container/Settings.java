/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.admin.container;

import com.mainPanel.Login;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author mrmango
 */
public class Settings extends javax.swing.JPanel {

    /**
     * Creates new form AdminEmployeeMain
     */
    public Settings() {
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

        btnLogout = new javax.swing.JButton();
        Title = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 239, 244));
        setPreferredSize(new java.awt.Dimension(940, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout.setBackground(new java.awt.Color(208, 135, 112));
        btnLogout.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(76, 86, 106));
        btnLogout.setText("LOGOUT");
        btnLogout.setBorder(null);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 120, 40));

        Title.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(46, 52, 64));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/settings.png"))); // NOI18N
        Title.setText("CONFIGURACION");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 200, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Login login = new Login();
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setVisible(true);
        SwingUtilities.getWindowAncestor(Title).dispose();

    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel Title;
    private static javax.swing.JButton btnLogout;
    // End of variables declaration//GEN-END:variables
}
