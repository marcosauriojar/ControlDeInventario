package control.service.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Connect {

    public Connect (){}

    public final String dbPath = "/home/tithanos/apps/ControlInventario/Inventario.db";

    public Connection connection(){
        Connection con = null;
        try{
            String url = "jdbc:sqlite:"+dbPath;
            con = DriverManager.getConnection(url);
            System.out.println("Conexion exitosa");
        }catch (SQLException sqle){
            sqle.printStackTrace();
        }
        if (con == null)
            return null;
        return con;
    }

}
