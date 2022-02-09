/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.functions;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author mrmango
 */
public class Design {

    static Color bgColorReset;

    public static void menuAnimation(JPanel pnlMenu) {
        if (pnlMenu.getWidth() == 210) {
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
        } else if (pnlMenu.getWidth() == 60) {
            pnlMenu.setSize(60, 625);
            Thread th = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 60; i <= 210; i++) {
                            Thread.sleep(1);
                            pnlMenu.setSize(i, 625);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };
            th.start();
        }
    }

    public static void panelChange(JPanel container, JPanel content) {
        container.removeAll();
        container.revalidate();
        container.repaint();
        container.add(content);
        container.revalidate();
        container.repaint();
    }

    public static void resetColor(JPanel panel) {
        panel.setBackground(bgColorReset);
    }

    public static void optionsColor(JPanel panel) {
        bgColorReset = panel.getBackground();
        panel.setBackground(new java.awt.Color(136, 192, 208));
    }

    public static void clickOptions(JPanel btnMenu, JPanel pnlMenu, JPanel btnActive, JPanel mainPanel, JPanel changePanel) {
        menuAnimation(pnlMenu);
        btnActive.setBackground(new java.awt.Color(216, 222, 233));
        btnMenu.setBackground(new java.awt.Color(94, 129, 172));
        bgColorReset = btnMenu.getBackground();
        panelChange(mainPanel, changePanel);
    }
}
