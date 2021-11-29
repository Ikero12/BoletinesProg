package com.Ejemplo;

public class Publicaciones {
    private int id;
    private String titulo;
    private String añoPublicacion;

    public Publicaciones() {
    }

    public Publicaciones(int id, String titulo, String añoPublicacion) {
        this.id = id;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }

    @Override
    public String toString() {
        return "id=" + id + ", titulo='" + titulo + ", añoPublicacion='" + añoPublicacion;
    }

    public int getId() {
        return id;
    }

    public String getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(String añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public void setId(int id) {
        this.id = id;
    }
}
