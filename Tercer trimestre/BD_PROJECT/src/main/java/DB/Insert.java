package DB;
import java.io.File;
import java.sql.*;

import static DB.Connect.*;

public class Insert {

    public static void insert(String Tabla,int ID,String Nombre,String DNI) {
        try {
            Connection conn = DriverManager.getConnection(url,user,pw);
            String insert = "INSERT INTO "+ Tabla + " VALUES "+ "("+ ID +","+"'"+Nombre+"'"+ ","+"'" + DNI + "')";
            Statement state = conn.createStatement();
            state.execute(insert);
            state.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
    }
