package com.Boletin9;

import javax.swing.*;

public class Posnegcer {


    public void Buclenum() {
        int numpos = 0;
        int numneg = 0;
        int numcer = 0;
        int contador;

        for (contador = 0; contador < 10; contador++) {
            int numero = readNum();
            if (numero > 0) {
                numpos++;
            } else if (numero < 0) {
                numneg++;
            } else {
                numcer++;
            }
        }

        JOptionPane.showMessageDialog(null, "Tienes " + numpos + " positivos, " + numneg + " negativos y " + numcer + " ceros.");

    }


    public static int readNum() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce tú número aquí crack: "));
        return numero;
    }


}
