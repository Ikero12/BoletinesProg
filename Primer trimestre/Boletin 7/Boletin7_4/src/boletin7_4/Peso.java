
package boletin7_4;

import javax.swing.JOptionPane;


public class Peso {
    
    public void Peso(){
        
        String nom1 = JOptionPane.showInputDialog(null, "Introduzca el nombre de la primera persona: ");
        String nom2 = JOptionPane.showInputDialog(null, "Introduzca el nombre de la segunda persona: ");
        
        float num1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Teclee el peso (kg) de "+nom1+ ": "));
        float num2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Teclee el peso (kg) de "+nom2+ ": "));
        
        if (num1>num2){
            JOptionPane.showMessageDialog(null, "La primera persona pesa más que la segunda y hay una diferencia de peso de: " + (num1-num2) + "kg" );
        }
        else{
            JOptionPane.showMessageDialog(null, "La segunda persona pesa más que la primera y hay una diferencia de peso de: " + (num2-num1) + "kg" );
        }
        
        
    }
   
   
  
    
}
