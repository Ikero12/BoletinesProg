
package boletin7_5;

import javax.swing.JOptionPane;


public class Mayor {
    
    public void Mayor(){
        
        int num1 = pedirnumero();
        int num2 = pedirnumero();
        int num3 = pedirnumero();
    
        
        if(num1>num2){
            if(num1>num3){
                JOptionPane.showMessageDialog(null, "El primer número " + num1 + " es el mayor de todos.");
            }
        }
        else if(num2>num1){
            if (num2>num3){
                JOptionPane.showMessageDialog(null, "El segundo número " + num2 + " es el mayor de todos.");
            }
        }
        else if(num3>num1){
            if(num3>num2){
                JOptionPane.showMessageDialog(null, "El tercer número " + num3 + " es el mayor de todos.");
            }
        }
    
    
    }   
    
    
    
    
    
    
    
    
    
    
    
    
    public int pedirnumero(){
        
       int num = Integer.parseInt(JOptionPane.showInputDialog("Teclea un número cualquiera: "));
        return num;
    
    
}
}
