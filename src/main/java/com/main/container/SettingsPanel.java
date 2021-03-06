/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.main.container;

import com.logic.main.Design;
import com.logic.model.Person;
import com.main.content.SettingsUser;

/**
 *
 * @author mrmango
 */
public class SettingsPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminEmployeeMain
     */
    public SettingsPanel(Person person) {
        initComponents();
        Design.panelChange(pnlContent, new SettingsUser(person));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();

        setBackground(new java.awt.Color(236, 239, 244));
        setPreferredSize(new java.awt.Dimension(940, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(46, 52, 64));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/settings.png"))); // NOI18N
        lblTitle.setText("CONFIGURACION");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 200, 30));

        pnlContent.setBackground(new java.awt.Color(236, 239, 244));
        pnlContent.setPreferredSize(new java.awt.Dimension(840, 500));
        pnlContent.setLayout(new javax.swing.BoxLayout(pnlContent, javax.swing.BoxLayout.LINE_AXIS));
        add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 840, 500));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel lblTitle;
    private static javax.swing.JPanel pnlContent;
    // End of variables declaration//GEN-END:variables
}
