/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_1;

import java.util.Scanner;


public class Boletin3_1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca los billetes de 100: ");
        int b100 = sc.nextInt()*100;
        System.out.println("Introduzca los billetes de 20: ");
        int b20 = sc.nextInt()*20;
        System.out.println("Introduzca los billetes de 5: ");
        int b5 = sc.nextInt()*5;
        System.out.println("Introduzca las monedas de un Euro: ");
        int m1 = sc.nextInt();
        
        
        
        System.out.println("Usted tiene " + (b100+b20+b5+m1) + "€" );
        
                
        
        
        
        
               
    }
    
}
