package control.vistas.login;

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
