
package boletin7_2;

import javax.swing.JOptionPane;


public class NumerosShort {
    
    public void NumerosShort(){
        short num1 = pedirnumero();
        short num2 = pedirnumero();
    
        
        if (num1>num2){
            System.out.println("La resta de " + num1 + " y " + num2 + " es: " + (num1-num2));
        }
        else {
            System.out.println("La suma de " + num2 + " y " + num1 + " es: " + (num2+num1));
        }
}
    
    
    
    
    
    
    public short pedirnumero(){
        
       short num = Short.decode(JOptionPane.showInputDialog("Teclea un número cualquiera (positivo o negativo): "));
        return num;
    }
    
    
}
