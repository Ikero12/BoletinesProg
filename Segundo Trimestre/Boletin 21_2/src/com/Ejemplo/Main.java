package com.Ejemplo;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int arraylength = 5;
        int notasAlumnos[];
        notasAlumnos = new int[arraylength];
        Random r = new Random();
        int aprobados = 0;
        int suspensos = 0;

        for(int j=0;j<arraylength;j++){
            notasAlumnos[j]=r.nextInt(10) + 1;
            System.out.println(Arrays.toString(notasAlumnos));
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
