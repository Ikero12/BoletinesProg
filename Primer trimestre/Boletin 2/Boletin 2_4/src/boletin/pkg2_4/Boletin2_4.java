
package boletin.pkg2_4;

import java.util.Scanner;


public class Boletin2_4 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       
       
        System.out.println("Introduzca el primer número: ");
       int num1 = sc.nextInt();
        System.out.println("Introduzca el segundo número: ");
       int num2 = sc.nextInt();
       
        System.out.println("La suma de los números es: " + (num1+num2) + ". La resta: " +  
                            (num1 - num2) + ". El producto: " + (num1 * num2) + ". Y el cociente: " + (num1 / num2));
        
       
       
    }
    
}
