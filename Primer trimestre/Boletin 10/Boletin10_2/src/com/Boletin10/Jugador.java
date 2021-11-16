package com.Boletin10;

import javax.swing.*;
import java.util.Random;

public class Jugador {
    private String jugador1;
    private String jugador2;
    private int numeroAdv;
    private int numeroAl;






   /* public void bucle() {
        int diferencia;
        diferencia = Math.abs(numeroAdv - numeroAl);
        switch (diferencia) {
            case (diferencia > 20):
                JOptionPane.showMessageDialog(null, "Estás muy lejos!");
            case (diferencia >= 10 && diferencia <= 20):
                JOptionPane.showMessageDialog(null, "Estás lejos!");
            case (diferencia > 10 && diferencia < 5):
                JOptionPane.showMessageDialog(null, "Estás cerca!");
            case (diferencia > 5):
                JOptionPane.showMessageDialog(null, "Estás muy cerca");

        }
        }


    public int numeroAleatorio() {
        Random numeroAl = new Random();
        int n =  numeroAl.nextInt(51);
        return n;
    }


    public String setJugador1(String jugador1) {
        this.jugador1 = jugador1;
        return jugador1;
    }

    public String setJugador2(String jugador2) {
        this.jugador2 = jugador2;
        return jugador2;
    }
}
