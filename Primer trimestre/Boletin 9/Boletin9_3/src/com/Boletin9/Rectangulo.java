package com.Boletin9;

import javax.swing.*;

public class Rectangulo {
    private float altura;
    private float base;

    public void buclerectangulo(){
        JOptionPane.showMessageDialog(null,"Introduce la altura y la base respectivamente (en m).");
        altura = readNumber();
        base = readNumber();

        while (altura>0 && base>0){
            JOptionPane.showMessageDialog(null, "El área del rectángulo es de: " + altura * base + " m");
            JOptionPane.showMessageDialog(null,"Introduce la altura y la base respectivamente.");
            altura = readNumber();
            base = readNumber();
        }

        JOptionPane.showMessageDialog(null, "No se pueden introducir números negativos.");
    }







    public static float readNumber(){
        float number= Float.parseFloat(JOptionPane.showInputDialog("Inserte número aquí"));
        return number;
    }





}



