/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.dev.panels;

import javax.swing.JPanel;
import com.dev.content.*;

/**
 *
 * @author mrmango
 */
public class AdminEmployee extends javax.swing.JPanel {

    /**
     * Creates new form AdminEmployeeMain
     */
    
    public AdminEmployee() {
        initComponents();
        pnlBack.setVisible(false);
        panelChange(Content, new AdminEmployeeMain());
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AddEmployee = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();
        pnlBack = new javax.swing.JPanel();
        btnBack = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 239, 244));
        setPreferredSize(new java.awt.Dimension(940, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setBackground(new java.awt.Color(236, 239, 244));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setText("EMPLOYEE");

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 10, -1, 50));

        AddEmployee.setBackground(new java.awt.Color(236, 239, 244));
        AddEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddEmployeeMouseClicked(evt);
            }
        });
        AddEmployee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_person.png"))); // NOI18N
        AddEmployee.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 41, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("Add Employee");
        AddEmployee.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 7, -1, 20));

        add(AddEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 140, 40));

        Content.setBackground(new java.awt.Color(236, 239, 244));
        Content.setPreferredSize(new java.awt.Dimension(840, 500));
        Content.setLayout(new javax.swing.BoxLayout(Content, javax.swing.BoxLayout.LINE_AXIS));
        add(Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 840, 500));

        pnlBack.setBackground(new java.awt.Color(236, 239, 244));
        pnlBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back_arrow.png"))); // NOI18N
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        pnlBack.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(pnlBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 40, 40));

        getAccessibleContext().setAccessibleName("pnlMain");
    }// </editor-fold>//GEN-END:initComponents

    private void AddEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddEmployeeMouseClicked
        AddEmployee.setVisible(false);
        pnlBack.setVisible(true);
        panelChange(Content, new AdminEmployeeAdd());
    }//GEN-LAST:event_AddEmployeeMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        panelChange(Content, new AdminEmployeeMain());
        AddEmployee.setVisible(true);
        pnlBack.setVisible(false);
    }//GEN-LAST:event_btnBackMouseClicked
     public void panelChange(JPanel container, JPanel content) {
        container.removeAll();
        container.revalidate();
        container.repaint();

        container.add(content);
        container.revalidate();
        container.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel AddEmployee;
    private static javax.swing.JPanel Content;
    private static javax.swing.JPanel Title;
    private static javax.swing.JLabel btnBack;
    private static javax.swing.JLabel jLabel3;
    private static javax.swing.JLabel jLabel4;
    private static javax.swing.JLabel jLabel5;
    private static javax.swing.JLabel jLabel6;
    private static javax.swing.JPanel pnlBack;
    // End of variables declaration//GEN-END:variables

}
