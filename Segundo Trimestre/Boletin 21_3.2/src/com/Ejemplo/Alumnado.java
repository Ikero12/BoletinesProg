package com.Ejemplo;

import javax.swing.*;

public class Alumnado {
    String nombre;
    float nota;

    public Alumnado (String nombre, float nota){
        this.nombre = nombre;
        this.nota = nota;
    }

    public static float readInt(){
        float num = Float.parseFloat(JOptionPane.showInputDialog("Introduce el número"));
        return num;
    }

    public static void mostrar(Alumnado[]lista) {
        for(Alumnado al:lista);
        JOptionPane.showMessageDialog(null, lista);


    }

    }

