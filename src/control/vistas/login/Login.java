package control.vistas.login;

import javax.swing.*;

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
