
package boletin.pkg7_1;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Numeros {
    Scanner sc;
    public void Numerotecleado(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea un número entero: ");


        int num1 = sc.nextInt();
        
        
        if (num1>0){
            //JOptionPane.showMessageDialog(null, num1 + " Es positivo.");
            System.out.println(num1 + " Es Positivo.");
        }
        else {
            //JOptionPane.showMessageDialog(null, num1 + " Es negativo.");
            System.out.println(num1 + " Es negativo.");
        }
        
                
    
                
    }

    /**
     * Método para pedir un número al usuario de tipo int
     * @return número introducido por usuario
     */
    public int pedirnumero(){
        
       int num = Integer.parseInt(JOptionPane.showInputDialog("Teclea un número cualquiera (positivo o negativo): "));
        return num;
    }
    
    
    
    
    
    
    
    
}
