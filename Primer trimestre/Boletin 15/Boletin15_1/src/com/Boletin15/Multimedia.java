package com.Boletin15;

public class Multimedia {
    private String titulo;
    private String autor;
    private String formato;
    private int duracion;

    public Multimedia() {
    }

    public Multimedia(String titulo, String autor, String formato, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "titulo='" + titulo + ", autor='" + autor + ", formato='" + formato + ", duracion=" + duracion;
    }
}
