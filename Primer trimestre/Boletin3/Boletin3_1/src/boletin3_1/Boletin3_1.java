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
        
        System.out.println("Introduzca el precio de su producto: ");
        float precio = sc.nextFloat();
        
        System.out.println("Ahora introduzca el precio pagado: ");
        float precio_pagado = sc.nextFloat();
        
        float descuento = (1-precio_pagado/precio)*100;
        
        System.out.println("El descuento del producto adquirido es de: " + descuento + "%");
        
               
    }
    
}
