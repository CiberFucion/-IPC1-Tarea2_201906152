package Tarea1;

import javax.swing.*;
import java.awt.event.*;

public class Tarea1 {

    public static JButton Boton = new JButton("Login");
    public static JTextField usuarioCaja;
    public static JTextField contrasenaCaja;

    public static void main(String[] args) {

        JFrame ventanaLogin = new JFrame("Tarea 1");
        ventanaLogin.setSize(500, 350);
        ventanaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        ventanaLogin.add(panel);
        componentesPanel1(panel);
        ventanaLogin.setVisible(true);

        String usuarioComp;
        String contrasenaComp;
        usuarioComp = "Juan Felipe";
        contrasenaComp = "201906152";

        Boton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                if (usuarioCaja.getText().equalsIgnoreCase(usuarioComp) && contrasenaCaja.getText().equalsIgnoreCase(contrasenaComp)) {
                    JOptionPane.showMessageDialog(null, "Hola Bienvenido \n Usuario: Juan Francisco Felipe Fernandez \n carnet: 201906152 ");
                } else {
                    JOptionPane.showMessageDialog(null, "La contrasena o el usuario no coinciden");
                }

            }
        });

    }

    public static void componentesPanel1(JPanel panel) {

        panel.setLayout(null);

        JLabel userLabel = new JLabel("User");

        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        usuarioCaja = userText;
        panel.add(usuarioCaja);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JTextField passwordText = new JTextField(20);
        passwordText.setBounds(100, 50, 165, 25);
        contrasenaCaja = passwordText;
        panel.add(contrasenaCaja);

        JButton loginButton;
        loginButton = Boton;
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

        JLabel label2 = new JLabel("Primer nombre");
        label2.setBounds(10, 100, 80, 40);
        panel.add(label2);
        JLabel label3 = new JLabel("Primer apellido");
        label3.setBounds(10, 120, 80, 40);
        panel.add(label3);

    }

}
