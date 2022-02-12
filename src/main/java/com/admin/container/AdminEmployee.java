/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.admin.container;
import com.admin.container.content.AdminEmployeesMain;
import com.admin.container.content.AdminEmployeesAdd;
import com.functions.Design;

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
        btnBack.setVisible(false);
        Design.panelChange(pnlContent, new AdminEmployeesMain());
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
        btnAddEmployee = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 239, 244));
        setPreferredSize(new java.awt.Dimension(940, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContent.setBackground(new java.awt.Color(236, 239, 244));
        pnlContent.setPreferredSize(new java.awt.Dimension(840, 500));
        pnlContent.setLayout(new javax.swing.BoxLayout(pnlContent, javax.swing.BoxLayout.LINE_AXIS));
        add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 840, 500));

        lblTitle.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(46, 52, 64));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee.png"))); // NOI18N
        lblTitle.setText("EMPLEADOS");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 20, 150, 30));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back_arrow.png"))); // NOI18N
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 25, -1, 20));

        btnAddEmployee.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnAddEmployee.setForeground(new java.awt.Color(46, 52, 64));
        btnAddEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_person.png"))); // NOI18N
        btnAddEmployee.setText("Empleado");
        btnAddEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddEmployeeMouseClicked(evt);
            }
        });
        add(btnAddEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 25, 90, 20));

        getAccessibleContext().setAccessibleName("pnlMain");
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        Design.panelChange(pnlContent, new AdminEmployeesMain());
        btnAddEmployee.setVisible(true);
        btnBack.setVisible(false);
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnAddEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddEmployeeMouseClicked
        Design.panelChange(pnlContent, new AdminEmployeesAdd());
        btnAddEmployee.setVisible(false);
        btnBack.setVisible(true);
    }//GEN-LAST:event_btnAddEmployeeMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel btnAddEmployee;
    private static javax.swing.JLabel btnBack;
    private static javax.swing.JLabel lblTitle;
    private static javax.swing.JPanel pnlContent;
    // End of variables declaration//GEN-END:variables

}
