package com.MetodosLyE;

import com.Boletines.Libros;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MetodosLectura {
    Scanner sc;


    public void leerLibroMostrarPrecio (){

        String tituloLibro = JOptionPane.showInputDialog("Introduzca el título del libro que desea buscar: ");
        Libros lib;
        ArrayList<Libros>listaTitulos= new ArrayList<>();
        try{
            String cadena;
            File fich = new File("Libreria.txt");
            sc = new Scanner(fich);
            while (sc.hasNextLine()){                                                                                       //bucle para repasar todas las iteraciones del fichero y escribirlos en un Arraylist
                cadena = sc.nextLine();
                String[]linea = cadena.split(",");
                lib = new Libros(linea[0],linea[1],Float.parseFloat(linea[2]),Integer.parseInt(linea[3]));
                // System.out.println(linea[0] + "...." + linea[1]);
                listaTitulos.add(lib);
            }
            boolean compobracion = true;                                                                                   //Variable para comprobar que el libro ha sido encontrado en el arraylist o no.
            for(int j =0;j<1;j++){
                    for (int i=0;i< listaTitulos.size();i++){
                        if(listaTitulos.get(i).getNombreL().equalsIgnoreCase(tituloLibro)){
                            JOptionPane.showMessageDialog(null, "El precio del libro es: " + listaTitulos.get(i).getPrecio() + "€");
                            compobracion = false;
                        }
                    }
                if (compobracion)
               JOptionPane.showMessageDialog(null,"Este libro no existe en la base de datos.");
            }

        }catch(IOException e){
            System.out.println("Error al leer 1" + e.getMessage());
        }finally {
            sc.close();
        }
        //return listaTitulos;
    }

}
