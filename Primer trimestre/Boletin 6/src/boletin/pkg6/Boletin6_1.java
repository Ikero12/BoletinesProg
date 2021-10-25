
package boletin.pkg6;

import java.util.Scanner;


public class Boletin6_1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Coche objcoche1 = new Coche();
        
        System.out.println("La velocidad actual es de: "+ objcoche1.getVelocidad());
        System.out.println("Hasta cuando quiere acelerar? ");
        objcoche1.acelerar(sc.nextInt());
        System.out.println("La velocidad ahora es de: " + objcoche1.getVelocidad()+ "\n");
        System.out.println("Introduce cuanto quieres frenar: ");
        objcoche1.frenar(sc.nextInt());
        System.out.println("La velocidad ahora es de: "+ objcoche1.getVelocidad());
        
        
        
        
        
        
        
        
        
    }
    
    
 
    
}
