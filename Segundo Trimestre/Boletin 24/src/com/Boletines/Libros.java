package com.Boletines;

import java.util.Objects;

public class Libros {

    String titulo;
    String autor;
    String ISBN;
    float precio;
    int numUnidades;

    public Libros(String titulo, String autor, String ISBN, float precio, int numUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
        this.numUnidades = numUnidades;

    }

    public Libros() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getNumUnidades() {
        return numUnidades;
    }

    public void setNumUnidades(int numUnidades) {
        this.numUnidades = numUnidades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libros libros = (Libros) o;
        return Float.compare(libros.precio, precio) == 0 && numUnidades == libros.numUnidades && Objects.equals(titulo, libros.titulo) && Objects.equals(autor, libros.autor) && Objects.equals(ISBN, libros.ISBN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, ISBN, precio, numUnidades);
    }
}
