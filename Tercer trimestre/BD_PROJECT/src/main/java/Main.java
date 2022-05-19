import DB.*;

import javax.swing.*;

public class Main {
            public static void main(String[] args) {
           String[] botones = {"Select", "Update", "Insert","Delete","Mostrar Tabla", "Cancelar"};
           boolean control=true;
           while(control){
             int ventana = JOptionPane.showOptionDialog(null, "Elegir accion: " ,
                          "Personas", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
                 switch(ventana){
                       case 0:
                           Select.selectSimple();
                           break;
                       case 1:
                           Update.updateSimple();
                           break;
                       case 2:
                           Insert.insert("Personas",2,"qerwty","324521278");
                           break;
                       case 3:
                           Delete.deleteSimple();
                           break;
                       case 4:
                           Select.selectTabla();
                           break;
                       case 5:
                           control=false;
                           break;
                       default:
                           System.out.println("Adiós!");
               }


    }
}}