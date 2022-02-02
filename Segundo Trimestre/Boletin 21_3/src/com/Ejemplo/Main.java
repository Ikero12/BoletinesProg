package com.Ejemplo;

import javax.swing.*;
import java.util.Arrays;
// import java.util.Random;
import exarrays.*;



public class Main {

    public static void main(String[] args) {

        int arraylength = Integer.parseInt(JOptionPane.showInputDialog("Cuantos alumnos hay en clase?"));
        int notasAlumnos[];
        notasAlumnos = new int[arraylength];
        // Random r = new Random();
        int aprobados = 0;
        int suspensos = 0;
        String Alumnos[];
        Alumnos = new String[arraylength];




        for(int j=0;j<arraylength;j++){
            Alumnos[j] = JOptionPane.showInputDialog("Introduzca el nombre del alumno: ");
            notasAlumnos[j]=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la nota del alumno: "));
            System.out.println(Arrays.toString(notasAlumnos));
            System.out.println(Arrays.toString(Alumnos));
        }

        for (int j=0;j<arraylength;j++){
            if (notasAlumnos[j] > 4){
                aprobados++;
            }
        }

        for (int j=0;j<arraylength;j++) {
            if (notasAlumnos[j] < 5) {
                suspensos++;
            }
        }

        Arrays.sort(notasAlumnos);
        int notaMax = notasAlumnos[notasAlumnos.length-1]; //Método de ordenar el array ascendentemente para encontrar el número más alto
        // System.out.println(notaMax);
        float sumaNotas = Arrays.stream(notasAlumnos).sum(); //Método para sumar los números del array
        // System.out.println("Nota media de la clase: " + sumaNotas / Arrays.stream(notasAlumnos).count());


        JOptionPane.showMessageDialog(null, " Las notas de los alumnos son: " + Arrays.toString(notasAlumnos) + "\n Hay un total de " + aprobados + " aprobados y " + suspensos + " Suspensos." +
                "\n Nota media de la clase: "+ sumaNotas / Arrays.stream(notasAlumnos).count() + "\n Y la nota más alta es: " + notaMax);




















































    }}
