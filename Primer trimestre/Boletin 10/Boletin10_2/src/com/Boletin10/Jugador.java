package com.Boletin10;

import javax.swing.*;
import java.util.Random;

public class Jugador {
    private String jugador1;
    private int numeroAdv;
    private int n;
    private int i;


    public void juego(){

        do {
            numeroAdv = Integer.parseInt(JOptionPane.showInputDialog(jugador1 + " Introduce número entre 0 y 50 aquí"));
            if (numeroAdv != n) {
                diferencianum();
            } else {
                JOptionPane.showMessageDialog(null, "U won111!!11!!11!1!");
                i++;
            }
        }while (i!=1);
    }


    public void diferenciaNum() {
        int diferencia;
        diferencia = Math.abs(numeroAdv - n);

        if (diferencia>20){
            JOptionPane.showMessageDialog(null, "Estás muy lejos!");
        }
        else if (diferencia >= 10 && diferencia <= 20){
            JOptionPane.showMessageDialog(null, "Estás lejos!");
        }
        else if (diferencia > 10 && diferencia < 5){
            JOptionPane.showMessageDialog(null, "Estás cerca!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Estás muy cerca");
        }

    }


    public int numeroAleatorio() {
        Random numeroAl = new Random();
        this.n =  numeroAl.nextInt(51);

        return n;
    }


    public String setJugador1(String jugador1) {
        this.jugador1 = jugador1;
        return jugador1;
    }

    }

