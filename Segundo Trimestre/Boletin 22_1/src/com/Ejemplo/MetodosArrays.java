package com.Ejemplo;

import javax.swing.*;
import java.util.Arrays;

public class MetodosArrays {

    public static void crearTabla(int[][]Goles, String []Jornadas,String[]Equipos){
        for(int fila=0;fila< Equipos.length;fila++){
            //System.out.print(Jornadas[fila]+"\n");
            System.out.print("\n" + Equipos[fila]+"         ");
            for(int columna=0;columna< Goles.length;columna++){
                Goles[fila][columna] = MetodosBasic.ReadInt(Equipos[fila]);
                System.out.print("    " + Goles[fila][columna]);
            }
            System.out.print("   "+sumaGoles(Goles)[fila]);
        }
    }
    public static void mostrarTabla(String[]tabla){
        for (int j=0;j<tabla.length;j++) {
            System.out.print(tabla[j] + "   ");
        }
    }

    public static int[] sumaGoles(int[][]Goles){
        int suma = 0;
        int []sumas=new int[3];
        for (int fila=0;fila< Goles.length;fila++){
            suma=0;
            for(int columna=0;columna<Goles[fila].length;columna++){
                suma = suma + Goles[fila][columna];
            }
            sumas[fila] = suma;
        }
        return sumas;
    }


    public static void consulta(String[]Equipos,int [][]Goles){
        int consultaEquipo = Integer.parseInt(JOptionPane.showInputDialog("De que equipo quiere saber cuantos goles han marcado?" + "\n"+  Arrays.toString(Equipos)));
        int consultaJornada = Integer.parseInt(JOptionPane.showInputDialog("Y de que jornada?"));

        JOptionPane.showMessageDialog(null, "El equipo " + Equipos[consultaEquipo-1] + " Ha marcado" +
                "\nen la jornada " + consultaJornada + " " +Goles[consultaEquipo-1][consultaJornada-1] +" Goles");

    }






}
