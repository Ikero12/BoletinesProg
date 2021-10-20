
package boletin.pkg5;

import java.util.Scanner;


public class Boletin5 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca los kilometros recorridos: ");
        float km = sc.nextFloat();
        System.out.println("Introduzca los litros consumidos: ");
        float litros = sc.nextFloat();
        System.out.println("Introduzca la velocidad media: ");
        float vMed = sc.nextFloat();
        System.out.println("Introduzca el precio de la gasolina: ");
        float pGas = sc.nextFloat();
        
        
        
        Consumo objConsumo1 = new Consumo(km,litros, vMed, pGas);
          
        objConsumo1.show();
            
        
    }
    
}
