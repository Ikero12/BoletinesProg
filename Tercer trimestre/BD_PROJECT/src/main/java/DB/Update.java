package DB;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.net.ConnectException;
import java.sql.ResultSet;
import java.sql.Statement;

public class Update {

    public static void updateSimple(){
        Connect.connection();

        try{
            String query = "Select id from Personas where id=" + JOptionPane.showInputDialog("Id que quiere actualizar");
            Statement st = Connect.conexion.createStatement();
            ResultSet res = st.executeQuery(query);
            res.next();
            int id = res.getInt("ID");
            st.executeUpdate("UPDATE Personas SET nombre='" + JOptionPane.showInputDialog("Introducir nuevo nombre: ")+"' WHERE id="+id);




        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }

}
