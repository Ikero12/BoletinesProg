package DB;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.Statement;

public class Delete {

    public static void deleteSimple(){
        Connect.connection();

        try{
            String query = "Select id from Personas where id=" + JOptionPane.showInputDialog("Id que quiere Eliminar: ");
            Statement st = Connect.conexion.createStatement();
            ResultSet res = st.executeQuery(query);
            res.next();
            int id = res.getInt("ID");
            st.executeUpdate("DELETE FROM Personas WHERE id="+id);




        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }


}
