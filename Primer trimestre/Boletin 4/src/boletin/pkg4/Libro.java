
package boletin.pkg4;


public class Libro {
    
    //Atributos
    
    private String titulo,autor;
    private int año;
    private short numPaginas;
    private float valoracion;
    
    //Constructores
    
    public Libro(){
    
    
    }
    
    public Libro (int a, short n, float v, String t, String at){
        autor=at;
        titulo=t;
        numPaginas=n;
        año=a;
        valoracion=v;
        
    }
    
    //Métodos de acceso
    
    public void setTitulo(String t){
        titulo= t;
    }
    public String getTitulo(){
        return titulo;
    }
        
    
    public void setAutor(String at){
        autor= at;
    }
    public String getAutor(){
        return autor;
    }
    
    
    public void setNumPaginas(short n){
        numPaginas = n;
    }
    public short getNumPaginas(){
        return numPaginas;
    }


    public void setAño(int a){
        año= a;
    }
    public int getAño(){
        return año;
    }

    
    public void setValoracion(float v){
        valoracion=v;
    }
    public float getValoracion(){
        return valoracion;
    }



    public void mostrar(String titulo, String autor, short numPaginas, int año, float valoracion){
        System.out.println("Titulo: " + titulo + "\n Autor: " + autor + "\n Numero de Páginas: " + numPaginas + "\n Año: " + año + "\n Valoracion: " + valoracion );
        
    }


}


