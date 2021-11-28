package com.boletin8;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Calculaciones calculos = new Calculaciones();

        String[] botones = {"Triangulo", "Circulo", "Cuadrado", "Cancelar"};
        int ventana = JOptionPane.showOptionDialog(null, "De que figura geométrica desea saber el area?" ,
                "Geometria", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);

        switch(ventana){
            case 0:
                float areat = calculos.calculotriangulo();
                JOptionPane.showMessageDialog(null,"El área del triángulo en cuestión es de: " + areat);
                break;
            case 1:
                float areac = calculos.calculocirculo();
                JOptionPane.showMessageDialog(null,"El área del círculo en cuestión es de: " + areac);
                break;
            case 2:
                float areacu = calculos.calculocuadrado();
                JOptionPane.showMessageDialog(null,"El área del cuadrado en cuestión es de: " + areacu);
                break;
            case 3:
                break;
            default:
                System.out.println("No válido.");


        }





    }
}
