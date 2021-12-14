
package boletin.pkg2_5;

import java.util.Scanner;


public class Boletin2_5 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca la distancia en millas");
        int millas = sc.nextInt();
        int conversion = millas * 1852;
        System.out.println("La distancia en metros es de: " + conversion + " m");
        
        
    }
    
}
