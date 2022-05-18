package DB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static DB.Connect.conexion;

public class Select {

    public static void selectSimple(){

        try {
            Connect.connection();
            Statement state = conexion.createStatement();
            ResultSet rs = state.executeQuery("Select * from Personas");
            while(rs.next()){
                System.out.println("ID=" + rs.getObject("id")
                                + ", Nombre= " + rs.getObject("Nombre")
                                + ", DNI= " + rs.getObject("DNI")
                        );
            }
            rs.close();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

}
