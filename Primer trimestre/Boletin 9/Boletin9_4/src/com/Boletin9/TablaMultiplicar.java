package com.Boletin9;

import javax.swing.*;

public class TablaMultiplicar {

    public void bucleMult(){
        int contador;
        int num1 = readNum();

        while(num1!=0){
            for(contador=0;contador<11;contador++){
                System.out.println(contador +  ". " + (num1*contador));
            }
        num1 = readNum();
        }

        JOptionPane.showMessageDialog(null,"N'est pas posible ");



    }


    public static int readNum() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce tú número aquí crack: "));
        return numero;
    }






}














