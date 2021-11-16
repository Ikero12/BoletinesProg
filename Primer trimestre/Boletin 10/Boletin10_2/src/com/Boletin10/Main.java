package com.Boletin10;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Jugador juego = new Jugador();

        juego.setJugador1(JOptionPane.showInputDialog("Introduzca su nombre: "));
        System.out.println(juego.numeroAleatorio());
        juego.juego();



    }
}

