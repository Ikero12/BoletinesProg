package com.boletin8;

import javax.swing.*;

public class Calculaciones {


   public float calculotriangulo(){
       JOptionPane.showMessageDialog(null, "Introduzca la base y la altura respectivamente.");
       float base = readNumber("la base");
       float altura = readNumber("la altura");
       float areaT = base * altura / 2;
       return areaT;
   }

    public float calculocuadrado(){
        JOptionPane.showMessageDialog(null, "Introduzca la medida del lado.");
        float lado = readNumber("el lado");
        float areaC = lado*lado;
        return areaC;
    }

    public float calculocirculo(){
        JOptionPane.showMessageDialog(null, "Introduzca el radio.");
        float radio = readNumber("el radio");
        float areaCir = (float) Math.PI * (radio*radio);
        return areaCir;
    }

    public float readNumber(String x){
        float number = Float.parseFloat(JOptionPane.showInputDialog("Introduzca "+ x +": "));
        return number;
    }
}
