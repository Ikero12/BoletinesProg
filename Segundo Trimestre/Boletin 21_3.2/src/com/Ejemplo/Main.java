package com.Ejemplo;

import javax.swing.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de alumnos: "));
        Alumnado[]lista = new Alumnado[elementos];

        for(int j=0;j<lista.length;j++){
            lista[j] = new Alumnado(JOptionPane.showInputDialog("Introduce el nombre: "),Alumnado.readInt());

        }

    Alumnado.mostrar(lista);







    }











}
