package com.Boletin9;

import javax.swing.*;

public class SumaProducto {

    public void segundoejercicio(){
        int suma=0;
        double mult=1;
        int contador = 10;

        do{
            suma = suma + contador;
            mult = mult * contador;
            contador++;
        }while (contador<91);

        JOptionPane.showMessageDialog(null, "La suma de los números comprendidos entre 10 y 90 es de: " + suma + "\n y la multiplicación es: " + mult);


    }














    public static int readNum() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce tú número aquí crack: "));
        return numero;
    }
}
