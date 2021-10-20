
package boletin.pkg4;

import java.util.Scanner;


public class Boletin4 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el titulo:");
        String ti = sc.nextLine();
        
        
        System.out.println("Introduzca el autor:");
        String au = sc.nextLine();
   
        
        System.out.println("Introduzca el año de publicación:");
        int an = sc.nextInt();
        
        
        System.out.println("Introduzca el número de páginas:");
        short num = sc.nextShort();
        
        
        System.out.println("Intrduzca la valoración:");
        float val = sc.nextFloat();
        
        Libro objLibro = new Libro();
        objLibro.mostrar(ti, au, num, an, val);
        
        
     
        
    }
    
}
