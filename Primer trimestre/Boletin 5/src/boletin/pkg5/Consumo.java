
package boletin.pkg5;


public class Consumo {
    
    //Atributos
    
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    
    //Métodos
    
    public Consumo(){
    
    
    }
    
    public Consumo(float km, float litros, float vMed, float pGas){
    
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    
    }
    
    public float getTempo(){
        float Tiempo = km/vMed;
        return Tiempo;
    }
    
    public float consumomedio(){
        
        
    }
    
    
    
}
