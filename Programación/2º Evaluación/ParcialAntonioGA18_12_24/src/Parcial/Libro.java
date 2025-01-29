package Parcial;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

// Clase Madre: Libro
class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private boolean disponible;

    public Libro(String titulo, String autor, String genero, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponible = disponible;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Genero: " + genero);
        System.out.println("Disponible: " + (disponible ? "Si" : "No"));
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("Libro prestado con éxito.");
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println("Libro devuelto con éxito.");
    }
}







