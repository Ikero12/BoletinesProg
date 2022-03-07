package com.Boletines;

import java.util.Objects;

public class Libros {
    String nombreL;
    String autor;
    float precio;
    int unidades;


    public Libros(String nombreL, String autor, float precio, int unidades) {
        this.nombreL = nombreL;
        this.autor = autor;
        this.precio = precio;
        this.unidades = unidades;
    }

    public Libros() {
    }

    public String getNombreL() {
        return nombreL;
    }

    public void setNombreL(String nombreL) {
        this.nombreL = nombreL;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return        nombreL +","+ autor + "," + precio + "," +unidades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libros libros = (Libros) o;
        return Float.compare(libros.precio, precio) == 0 && unidades == libros.unidades && Objects.equals(nombreL, libros.nombreL) && Objects.equals(autor, libros.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreL, autor, precio, unidades);
    }
}
