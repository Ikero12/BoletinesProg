package com.MetodosLyE;

import com.Boletines.Libros;
import MetodosIker.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MetodosEscritura {
    FileWriter fich;
    PrintWriter escribir;
    Libros l;


    public void añadirLibro (){
        try{
            fich = new FileWriter("Libreria.txt",true);
            escribir = new PrintWriter(fich);
            l = new Libros(MetodosIker.ReadString("Nombre Libro: "),MetodosIker.ReadString("Nombre Autor: "), MetodosIker.ReadFloat(),MetodosIker.ReadInt());

            escribir.println(l);
        }catch(IOException e){
            System.out.println("Error de escritura" + e.getMessage());
        }finally {
            escribir.close();
        }
    }
}
