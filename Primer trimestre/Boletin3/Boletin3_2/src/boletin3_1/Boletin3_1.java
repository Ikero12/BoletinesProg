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
        
        System.out.println("Introduzca los grados Celsius que desea convertir: ");
        float gradosC = sc.nextFloat();
        
        double gradosF = (gradosC*1.8+32);
        double gradosK =  (gradosC+273.15);
        
        System.out.println("La conversión a grados Fahrenheit es de: " + gradosF + " Y a grados Kelvin " + gradosK);
        
        
        
        
               
    }
    
}
