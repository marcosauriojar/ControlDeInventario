package control.service.login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import control.objects.Usuario;
import control.service.db.Connect;

import javax.swing.*;

public class LoginAuth {
    private final Connect connect = new Connect();

    public LoginAuth(){}

    public void loginAuth(String usr, String pass){
        String sql = "SELECT * FROM USUARIOS WHERE USUARIO ='"+usr+"'";
        Connection con = connect.connection();
        Usuario usuario = null;
        try{
            Statement stmn = con.createStatement();
            ResultSet rs = stmn.executeQuery(sql);

            while (rs.next()){
                 usuario = new Usuario(rs.getInt(1),
                        rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getInt(5));
            }

            if(usuario != null){
                if(usr.equals(usuario.getUsuario()) && pass.equals(usuario.getPassword())){
                    System.out.println("Logueo correcto!");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta.");
                }

            }else{
                JOptionPane.showMessageDialog(null, "No existe el usuario ingresado.");
            }

        }catch (SQLException sqle){
            sqle.printStackTrace();
        }

    }

}
