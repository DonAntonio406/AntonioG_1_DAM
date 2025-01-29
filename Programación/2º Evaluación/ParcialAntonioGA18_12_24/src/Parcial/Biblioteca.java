package Parcial;

import java.util.ArrayList;

//Clase de Gestión de la Biblioteca
class Biblioteca {
 private ArrayList<Libro> listaLibros = new ArrayList<>();

 public void agregarLibro(Libro libro) {
     listaLibros.add(libro);
     System.out.println("Libro agregado con éxito.");
 }

 public void listarLibros() {
     for (Libro libro : listaLibros) {
         libro.mostrarInfo();
         System.out.println("-----------------------");
     }
 }

 public void buscarLibro(String titulo) {
     for (Libro libro : listaLibros) {
         if (libro.getTitulo().equalsIgnoreCase(titulo)) {
             libro.mostrarInfo();
             return;
         }
     }
     System.out.println("Libro no encontrado.");
 }

 public void prestarLibro(String titulo) {
     for (Libro libro : listaLibros) {
         if (libro.getTitulo().equalsIgnoreCase(titulo)) {
             libro.prestar();
             return;
         }
     }
     System.out.println("Libro no encontrado.");
 }

 public void devolverLibro(String titulo) {
     for (Libro libro : listaLibros) {
         if (libro.getTitulo().equalsIgnoreCase(titulo)) {
             libro.devolver();
             return;
         }
     }
     System.out.println("Libro no encontrado.");
 }
}