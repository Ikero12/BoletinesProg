
package boletin.pkg6;


public class Coche {
    
    private int velocidad;
    
    public Coche(){
        velocidad=0;
        
    }
    
    
    
    public int getVelocidad(){
        return velocidad;
        
    }
    
    public int acelerar(int valor){
        velocidad = valor + velocidad;
        return velocidad;
    }
    
    public int frenar(int valor){
        velocidad = velocidad - valor;
        return velocidad;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
