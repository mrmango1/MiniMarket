package com.dev.minimarket;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    public String user, password;
    private JPanel LoginPanel;
    private JTextField userTextField;
    private JButton loginButton;
    private JTextField passwordTextField;

    public Login(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(LoginPanel);
        this.pack();
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user = userTextField.getText();
                password = passwordTextField.getText();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new Login("Mini Market");
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
