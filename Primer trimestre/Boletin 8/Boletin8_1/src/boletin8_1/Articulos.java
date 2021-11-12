
package boletin8_1;

import javax.swing.JOptionPane;


public class Articulos {
    
    private int ventas;
    private String articulo;
    
        public void tipoventas(){
            String ar = articulo();
            ventas = ventas();
        if (ventas<=100){
            JOptionPane.showMessageDialog(null, "El consumo de " + ar+ " es bajo.");
        }
        else if (ventas<=500){
            JOptionPane.showMessageDialog(null, "El consumo de " + ar + " es medio.");
        }
        
        else if (ventas<=1000){
            JOptionPane.showMessageDialog(null, "El consumo de " + ar + " es alto");
        }
        
        else{
            JOptionPane.showMessageDialog(null, "El consumo de " + ar+ " es de primera necesidad.");
        }
        } 
   
    
    
        
    public String articulo(){
        String articulo = JOptionPane.showInputDialog(null, "Introduzca el nombre del árticulo: ");
        return articulo;
    }
    public int ventas(){
        int ventas = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca las ventas del árticulo: "));
        return ventas;
    }
}
