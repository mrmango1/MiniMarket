/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.dev.mainPanel;

import java.awt.Color;
import javax.swing.*;
import com.dev.panels.*;

/**
 *
 * @author mrmango
 */
public class AdminMain extends javax.swing.JFrame {

    Color bgColorReset;
    int pos = 0;
    int x = 210;


    public AdminMain() {
        initComponents();
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

        background = new javax.swing.JPanel();
        pnlStatus = new javax.swing.JPanel();
        btnMenu = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        btnDashboard = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnEmployee = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSales = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnCustomers = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnSupplier = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnSettings = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        pnlMain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 625));
        setMinimumSize(new java.awt.Dimension(1000, 625));
        setUndecorated(true);

        background.setBackground(new java.awt.Color(236, 239, 244));
        background.setMaximumSize(new java.awt.Dimension(1000, 625));
        background.setMinimumSize(new java.awt.Dimension(1000, 625));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlStatus.setBackground(new java.awt.Color(94, 129, 172));

        btnMenu.setBackground(new java.awt.Color(94, 129, 172));
        btnMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu.png"))); // NOI18N
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.setOpaque(true);
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuMouseExited(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(208, 135, 112));
        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.png"))); // NOI18N
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.setOpaque(true);
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 86, 106));
        jLabel1.setText("MINIMARKET QMET");

        javax.swing.GroupLayout pnlStatusLayout = new javax.swing.GroupLayout(pnlStatus);
        pnlStatus.setLayout(pnlStatusLayout);
        pnlStatusLayout.setHorizontalGroup(
            pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatusLayout.createSequentialGroup()
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(352, 352, 352)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 374, Short.MAX_VALUE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlStatusLayout.setVerticalGroup(
            pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlStatusLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnlStatusLayout.createSequentialGroup()
                            .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addGap(30, 30, 30))
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        background.add(pnlStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 40));

        pnlMenu.setBackground(new java.awt.Color(216, 222, 233));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDashboard.setBackground(new java.awt.Color(216, 222, 233));
        btnDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDashboardMouseExited(evt);
            }
        });
        btnDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/account.png"))); // NOI18N
        btnDashboard.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 45));

        jLabel7.setBackground(new java.awt.Color(76, 86, 106));
        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(76, 86, 106));
        jLabel7.setText("Dashboard");
        btnDashboard.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 100, 45));

        pnlMenu.add(btnDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 135, 210, 45));

        btnEmployee.setBackground(new java.awt.Color(216, 222, 233));
        btnEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmployeeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEmployeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEmployeeMouseExited(evt);
            }
        });
        btnEmployee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee.png"))); // NOI18N
        btnEmployee.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 45));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(76, 86, 106));
        jLabel5.setText("Employee");
        btnEmployee.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 100, 45));

        pnlMenu.add(btnEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 210, 45));

        btnSales.setBackground(new java.awt.Color(216, 222, 233));
        btnSales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalesMouseExited(evt);
            }
        });
        btnSales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shopping_car.png"))); // NOI18N
        btnSales.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 45));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(76, 86, 106));
        jLabel9.setText("Sales");
        btnSales.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 100, 45));

        pnlMenu.add(btnSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 225, 210, 45));

        btnCustomers.setBackground(new java.awt.Color(216, 222, 233));
        btnCustomers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCustomersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCustomersMouseExited(evt);
            }
        });
        btnCustomers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customer.png"))); // NOI18N
        btnCustomers.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 45));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(76, 86, 106));
        jLabel13.setText("Customers");
        btnCustomers.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 100, 45));

        pnlMenu.add(btnCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 210, 45));

        btnSupplier.setBackground(new java.awt.Color(216, 222, 233));
        btnSupplier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSupplierMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSupplierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSupplierMouseExited(evt);
            }
        });
        btnSupplier.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supplier.png"))); // NOI18N
        btnSupplier.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 45));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(76, 86, 106));
        jLabel11.setText("Suppliers");
        btnSupplier.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 100, 45));

        pnlMenu.add(btnSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 315, 210, 45));

        btnSettings.setBackground(new java.awt.Color(216, 222, 233));
        btnSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSettingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSettingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSettingsMouseExited(evt);
            }
        });
        btnSettings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/settings.png"))); // NOI18N
        btnSettings.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 45));

        jLabel17.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(76, 86, 106));
        jLabel17.setText("Settings");
        btnSettings.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 100, 45));

        pnlMenu.add(btnSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 210, 45));

        background.add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 210, 590));

        pnlMain.setBackground(new java.awt.Color(236, 239, 244));
        pnlMain.setLayout(new java.awt.CardLayout());
        background.add(pnlMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 940, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        if (x == 210) {
            pnlMenu.setSize(210, 625);
            Thread th = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 210; i >= 60; i--) {
                            Thread.sleep(1);
                            pnlMenu.setSize(i, 625);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };
            th.start();
            x = 60;
        } else if (x == 60) {
            pnlMenu.setSize(x, 625);
            Thread th = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 60; i <= x; i++) {
                            Thread.sleep(1);
                            pnlMenu.setSize(i, 625);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };
            th.start();
            x = 210;
        }
    }//GEN-LAST:event_btnMenuMouseClicked

    private void btnMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseEntered
        bgColorReset = btnMenu.getBackground();
        menuColor(btnMenu);
    }//GEN-LAST:event_btnMenuMouseEntered

    private void btnMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseExited
        resetColor(btnMenu);
    }//GEN-LAST:event_btnMenuMouseExited

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        bgColorReset = btnClose.getBackground();
        closeColor(btnClose);
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        resetColor(btnClose);
    }//GEN-LAST:event_btnCloseMouseExited

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseEntered
        bgColorReset = btnDashboard.getBackground();
        optionsColor(btnDashboard);
    }//GEN-LAST:event_btnDashboardMouseEntered

    private void btnDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseExited
        resetColor(btnDashboard);
    }//GEN-LAST:event_btnDashboardMouseExited

    private void btnEmployeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmployeeMouseEntered
        bgColorReset = btnEmployee.getBackground();
        optionsColor(btnEmployee);
    }//GEN-LAST:event_btnEmployeeMouseEntered

    private void btnEmployeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmployeeMouseExited
        resetColor(btnEmployee);
    }//GEN-LAST:event_btnEmployeeMouseExited

    private void btnSalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalesMouseEntered
        bgColorReset = btnSales.getBackground();
        optionsColor(btnSales);
    }//GEN-LAST:event_btnSalesMouseEntered

    private void btnSalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalesMouseExited
        resetColor(btnSales);
    }//GEN-LAST:event_btnSalesMouseExited

    private void btnCustomersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomersMouseEntered
        bgColorReset = btnCustomers.getBackground();
        optionsColor(btnCustomers);
    }//GEN-LAST:event_btnCustomersMouseEntered

    private void btnCustomersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomersMouseExited
        resetColor(btnCustomers);
    }//GEN-LAST:event_btnCustomersMouseExited

    private void btnSupplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierMouseEntered
        bgColorReset = btnSupplier.getBackground();
        optionsColor(btnSupplier);
    }//GEN-LAST:event_btnSupplierMouseEntered

    private void btnSupplierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierMouseExited
        resetColor(btnSupplier);
    }//GEN-LAST:event_btnSupplierMouseExited

    private void btnSettingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingsMouseEntered
        bgColorReset = btnSettings.getBackground();
        optionsColor(btnSettings);
    }//GEN-LAST:event_btnSettingsMouseEntered

    private void btnSettingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingsMouseExited
        resetColor(btnSettings);
    }//GEN-LAST:event_btnSettingsMouseExited

    private void btnDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseClicked
        if (!(pos == 1)) {
            menuColorChange();
            btnDashboard.setBackground(new java.awt.Color(94, 129, 172));
            bgColorReset = btnDashboard.getBackground();
            panelChange(pnlMain, new AdminDashboard());
            pnlMenu.setSize(60, 625);
            x=210;
        }if(pos==1){
            x=60;
        }
        pnlMenu.setSize(60, 625);
        pos = 1;
        
    }//GEN-LAST:event_btnDashboardMouseClicked

    private void btnEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmployeeMouseClicked
        if (!(pos == 2)) {
            menuColorChange();
            btnEmployee.setBackground(new java.awt.Color(94, 129, 172));
            bgColorReset = btnEmployee.getBackground();
            panelChange(pnlMain, new AdminEmployeeMain());
            pnlMenu.setSize(60, 625);
            x=210;
        }if(pos==2){
            x=60;
        }
        pnlMenu.setSize(60, 625);
        pos = 2;
    }//GEN-LAST:event_btnEmployeeMouseClicked

    private void btnSalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalesMouseClicked
        if (!(pos == 3)) {
            menuColorChange();
            btnSales.setBackground(new java.awt.Color(94, 129, 172));
            bgColorReset = btnSales.getBackground();
            panelChange(pnlMain, new AdminSales());
            pnlMenu.setSize(60, 625);
            x=210;
        }if(pos==3){
            x=60;
        }
        pnlMenu.setSize(60, 625);
        pos = 3;
    }//GEN-LAST:event_btnSalesMouseClicked

    private void btnCustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomersMouseClicked
        if (!(pos == 4)) {
            menuColorChange();
            btnCustomers.setBackground(new java.awt.Color(94, 129, 172));
            bgColorReset = btnCustomers.getBackground();
            panelChange(pnlMain, new AdminCustomers());
            pnlMenu.setSize(60, 625);
            x=210;
        }if(pos==4){
            x=60;
        }
        pnlMenu.setSize(60, 625);
        pos = 4;
    }//GEN-LAST:event_btnCustomersMouseClicked

    private void btnSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierMouseClicked
        if (!(pos == 5)) {
            menuColorChange();
            btnSupplier.setBackground(new java.awt.Color(94, 129, 172));
            bgColorReset = btnSupplier.getBackground();
            panelChange(pnlMain, new AdminSuppliers());
            pnlMenu.setSize(60, 625);
            x=210;
        }if(pos==5){
            x=60;
        }
        pnlMenu.setSize(60, 625);
        pos = 5;
    }//GEN-LAST:event_btnSupplierMouseClicked

    private void btnSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingsMouseClicked
        if (!(pos == 6)) {
            menuColorChange();
            btnSettings.setBackground(new java.awt.Color(94, 129, 172));
            bgColorReset = btnSettings.getBackground();
            panelChange(pnlMain, new Settings());
            pnlMenu.setSize(60, 625);
            x=210;
        }if(pos==6){
            x=60;
        }
        pnlMenu.setSize(60, 625);
        pos = 6;
    }//GEN-LAST:event_btnSettingsMouseClicked
    private void resetColor(JLabel label) {
        label.setBackground(bgColorReset);
    }

    private void resetColor(JPanel panel) {
        panel.setBackground(bgColorReset);
    }

    private void optionsColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(136, 192, 208));
    }

    private void menuColor(JLabel label) {
        label.setBackground(new java.awt.Color(129, 161, 193));
    }

    private void closeColor(JLabel label) {
        label.setBackground(new java.awt.Color(191, 97, 106));
    }

    public void panelChange(JPanel container, JPanel content) {
        container.removeAll();
        container.revalidate();
        container.repaint();

        container.add(content);
        container.revalidate();
        container.repaint();
    }

    public void menuColorChange() {
        btnDashboard.setBackground(new java.awt.Color(216, 222, 233));
        btnEmployee.setBackground(new java.awt.Color(216, 222, 233));
        btnSales.setBackground(new java.awt.Color(216, 222, 233));
        btnCustomers.setBackground(new java.awt.Color(216, 222, 233));
        btnSupplier.setBackground(new java.awt.Color(216, 222, 233));
        btnSettings.setBackground(new java.awt.Color(216, 222, 233));
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel btnClose;
    private javax.swing.JPanel btnCustomers;
    private javax.swing.JPanel btnDashboard;
    private javax.swing.JPanel btnEmployee;
    private javax.swing.JLabel btnMenu;
    private javax.swing.JPanel btnSales;
    private javax.swing.JPanel btnSettings;
    private javax.swing.JPanel btnSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlStatus;
    // End of variables declaration//GEN-END:variables
}
