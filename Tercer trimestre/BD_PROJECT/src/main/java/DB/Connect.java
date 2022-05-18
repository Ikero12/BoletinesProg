package DB;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;

import com.mysql.jdbc.Driver;

public class Connect {
    final static String url = "jdbc:mysql://localhost/prueba";
    final static String user = "Iker";
    final static String pw="Iker123.";

    static Connection conexion = null;
    public static void connection(){

        try {
            conexion = DriverManager.getConnection(url,user,pw);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("You are succesfully connected to the database!");
    }

    public static void Disconnect(){
        try {
            conexion.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Disconnected!");
    }

   }