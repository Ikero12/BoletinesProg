
package boletin.pkg2_3;

import java.util.Scanner;

public class Boletin2_3 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca la cantidad de euros que quiere cambiar:");
        
        float euros = sc.nextFloat();
        
        System.out.println("Y a cuanto está el cambio? ");
        
        float dolar = sc.nextFloat();
        
        float cambio = euros * dolar;
        
        System.out.println("Su cambio es de " + cambio + " Dólares.");
        
        
        
        
        
        
        
    }
    
}
