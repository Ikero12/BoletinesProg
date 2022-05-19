package DB;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

import static DB.Connect.*;

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

    public static void selectTabla(){
            Connect.connection();

        try{
            String query = "SELECT * FROM Personas";

            Statement stm = conexion.createStatement();
            ResultSet res = stm.executeQuery(query);

            String columns[] = { "ID", "Nombre", "DNI" };
            String data[][] = new String[8][3];

            int i = 0;
            while (res.next()) {
                int id = res.getInt("ID");
                String nom = res.getString("Nombre");
                String DNI = res.getString("DNI");
                data[i][0] = id + "";
                data[i][1] = nom;
                data[i][2] = DNI;
                i++;
            }

            DefaultTableModel model = new DefaultTableModel(data, columns){
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }};
            JTable table = new JTable(model);
            table.isCellEditable(0,0);
            table.setShowGrid(true);
            table.setShowVerticalLines(true);
            JScrollPane pane = new JScrollPane(table);
            JFrame f = new JFrame("Personas");
            JPanel panel = new JPanel();
            panel.add(pane);
            f.add(panel);
            f.setSize(500, 250);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);

    } catch(SQLException e) {
        e.printStackTrace();
    }
}
    }


