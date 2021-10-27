
package boletin7_3;

import javax.swing.JOptionPane;


public class Covid {
    
    public void covid(){
        
        int num = pedirnumero();
        
        if(num>0){
            JOptionPane.showMessageDialog(null, "+");
        }
        else if (num==0){
            JOptionPane.showMessageDialog(null, "0");
        }
        else{
            JOptionPane.showMessageDialog(null, "-");
        }
    }
    
    public int pedirnumero(){
        
       int num = Integer.parseInt(JOptionPane.showInputDialog("Teclea un número cualquiera (positivo o negativo): "));
        return num;
    }
    
    
    
    
    
    
    
    
    
}
