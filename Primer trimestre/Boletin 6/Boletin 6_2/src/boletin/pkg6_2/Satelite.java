
package boletin.pkg6_2;

/**
 *
 * @author dam1
 */
public class Satelite {
    
    private double meridiano;
    private double paralelo;
    private double distanciaTerra;
    
 public Satelite(){

  meridiano = paralelo = distanciaTerra = 0;
          
}    
    
    public Satelite(double mer, double par, double dis){

    this.meridiano = mer;
    this.paralelo = par;
    this.distanciaTerra = dis;

}    

    
    
public void verPosicion ( ) {

System.out.println("o satelite atopase no paralelo " + paralelo + " meridiano " + meridiano + " a unha distancia da terra de " + distanciaTerra);   
    
    
}  
    
    
    
    
}
