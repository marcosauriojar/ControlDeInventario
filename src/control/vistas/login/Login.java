package control.vistas.login;

import control.service.login.LoginAuth;
import sun.rmi.runtime.Log;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {

    private JLabel title;
    private JTextField jTextUser;
    private JPasswordField jPassworPassword;
    private JLabel jLabelPassword;
    private JLabel jLabelUser;
    private JButton iniciarButton;
    private JButton limpiarButton;
    private JPanel jPanelMain;

    public Login(){

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jTextUser.setText("");
                jPassworPassword.setText("");
            }
        });
        iniciarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                LoginAuth lg = new LoginAuth();
                String usuario = jTextUser.getText();
                String pass ="";
                char password[] = jPassworPassword.getPassword();
                for(int i = 0; i<password.length; i++){
                    pass = pass + password[i];
                }
                lg.loginAuth(usuario,pass);
            }
        });
    }
    public void createUIComponents() {
        JFrame frame = new JFrame("Iniciar Sesion");
        frame.setSize(800,600);
        frame.setResizable(true);
        frame.setContentPane( new Login().jPanelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
