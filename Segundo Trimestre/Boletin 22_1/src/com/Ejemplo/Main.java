package com.Ejemplo;



public class Main {

    public static void main(String[] args) {
       String[]jornadas={"Equipos/Goles","X1","X2","X3","Goles totales"};
       String[]equipos={"1.FCB","2.RMD","3.ATM"};
       int[][]goles= new int[3][3];


       MetodosArrays.mostrarTabla(jornadas);
       MetodosArrays.crearTabla(goles, jornadas, equipos);
       // System.out.println("\n"+MetodosArrays.sumaGoles(goles)[1]);
        MetodosArrays.consulta(equipos,goles); //Consultas por equipo indicando el número de goles en x jornada
    }
}
