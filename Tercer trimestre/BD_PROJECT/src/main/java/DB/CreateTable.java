package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static DB.Connect.*;

public class CreateTable {

    public static void createNewTable(String Nombre_tabla) {



        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS "+ Nombre_tabla +" (\n"
                + " id integer PRIMARY KEY,\n"
                + " Nombre text NOT NULL,\n"
                + " DNI VARCHAR\n"
                + ");";

        try{
            Connect.connection();
            Statement stmt = conexion.createStatement();
            stmt.execute(sql);
            stmt.close();
            Connect.Disconnect();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }  }
