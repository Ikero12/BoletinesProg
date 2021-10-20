
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
    
    public float consumoMedio(){
        float consumoMedio = this.litros*100/this.km;
        return consumoMedio;
    }
    
    public float consumoEuros(){
        float consumoEuros = this.litros*100/this.pGas;
        return consumoEuros;
    }
    
    public void setkms(float kms){
        this.km = kms;
        
    }
    
    public void setlitros(float lit){
        this.litros = lit;
    }
    
    public void setvmed(float vmed){
        this.vMed = vmed;
    }

    public void setpgas(float pgas){
        this.pGas = pgas;
    }


    public void show(){
        System.out.println("Los kilometros recorridos son: " + this.km + "\n Los litros consumidos son : " + this.litros + "\n La velocidad media es: " + this.vMed + "\n El precio de la gasolina es: " + this.pGas + "\n El tiempo para realizar el viaje es de: " + getTempo() +"Horas" + "\n El consumo medio es de: " + consumoMedio() +"l/100km" + "\n Los euros gastados por el consumo cada 100km son: " + consumoEuros());
        
    }



}









