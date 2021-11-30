package com.Ejemplo;

public class Revista extends Publicaciones{
    private int idrevista;

    public Revista() {
    }

    public Revista(int id, String titulo, String añoPublicacion, int idrevista) {
        super(id, titulo, añoPublicacion);
        this.idrevista = idrevista;
    }

    @Override
    public String toString() {
        return super.toString() + " idrevista=" + idrevista;
    }

}
