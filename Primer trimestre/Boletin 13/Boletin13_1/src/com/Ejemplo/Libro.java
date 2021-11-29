package com.Ejemplo;

public class Libro extends Publicaciones{
    private boolean prestado;

    public Libro() {
    }

    public Libro(int id, String titulo, String añoPublicacion, boolean prestado) {
        super(id, titulo, añoPublicacion);
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return super.toString() + "prestado=" + prestado;
    }
}
