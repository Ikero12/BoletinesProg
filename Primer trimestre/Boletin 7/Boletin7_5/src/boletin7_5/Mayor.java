
package boletin7_5;

import javax.swing.JOptionPane;


public class Mayor {
    
    public void Mayor(){
        
        int num1 = pedirnumero();
        int num2 = pedirnumero();
        int num3 = pedirnumero();
    
        
        if(num1>num2){
            if(num1>num3){
                JOptionPane.showMessageDialog(null, "El primer número es el mayor.");
            }
        }
        else if(num2>num3){
                JOptionPane.showMessageDialog(null, "El segundo número es el mayor.");  
        }
        else {
                JOptionPane.showMessageDialog(null, "El tercer número es el mayor.");
        }
    
    
    }   
    
    
    
    
    public int pedirnumero(){
        
       int num = Integer.parseInt(JOptionPane.showInputDialog("Teclea un número cualquiera: "));
        return num;
    
    
}
}
