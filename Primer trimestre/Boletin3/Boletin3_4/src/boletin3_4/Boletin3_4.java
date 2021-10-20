/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_4;


import java.util.Scanner;

public class Boletin3_4 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca los euros que desea convertir: ");
        int total = sc.nextInt();
        int b100 = total/100;
        int control;
        control = total - (b100*100);
        int b20 = control/20;
        control = control - (b20*20);
        int b5 = control/5;
        control = control - (b5*5);
        int m1 = control/1;
        
        System.out.println("Usted tiene " + b100+ " Billetes de cien \n" + b20 + " Billetes de veinte \n" + b5 + " Billetes de cinco \n" + m1 + " Monedas de un euro.\n" );
        
        
        
        
        
        
        
        
    }
    
}
