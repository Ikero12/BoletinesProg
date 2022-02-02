package com.Ejemplo;

import javax.swing.*;

public class MetodosBasic {
        public static int ReadInt(String Equipo) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Introducir goles del " + Equipo + ": "));
            return numero;
        }

        public static float ReadFloat() {
            float numero = Float.parseFloat(JOptionPane.showInputDialog("Introducir valor: "));
            return numero;
        }

        public static double ReadDouble() {
            double numero = Double.parseDouble(JOptionPane.showInputDialog("Introducir valor: "));
            return numero;
        }
}
