
package boletin7_4;

import javax.swing.JOptionPane;


public class Peso {
    
    public void Peso(){
        
        float num1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Teclee el peso de la primera persona: "));
        float num2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Teclee el peso de la segunda persona: "));
        
        if (num1>num2){
            JOptionPane.showMessageDialog(null, "La primera persona pesa más que la segunda y hay una diferencia de peso de: " + (num1-num2) );
        }
        else{
            JOptionPane.showMessageDialog(null, "La segunda persona pesa más que la primera y hay una diferencia de peso de: " + (num2-num1) );
        }
        
        
    }
    
   
    
    
    
    
}
