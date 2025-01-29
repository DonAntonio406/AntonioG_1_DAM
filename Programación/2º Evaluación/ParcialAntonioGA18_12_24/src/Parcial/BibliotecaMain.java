package Parcial;

import java.util.Scanner;

//Clase Principal: Main
public class BibliotecaMain {
 public static void main(String[] args) {
     Biblioteca biblioteca = new Biblioteca();
     Scanner scanner = new Scanner(System.in);

     // Agregar algunos libros físicos y digitales
     biblioteca.agregarLibro(new LibroFisico("El Quijote", "Miguel de Cervantes", "Novela", true, "Sección A, Estantería 3", 1056 ));
     biblioteca.agregarLibro(new LibroDigital("Harry Potter", "J.K. Rowling", "Fantasía", true, 1.5 , "EPUB"));

     int opcion;
     do {
         System.out.println("Menú:");
         System.out.println("1. Agregar un libro");
         System.out.println("2. Listar libros");
         System.out.println("3. Buscar un libro por título");
         System.out.println("4. Prestar un libro");
         System.out.println("5. Devolver un libro");
         System.out.println("6. Salir");
         System.out.print("Seleccione una opción: ");
         opcion = scanner.nextInt();
         scanner.nextLine();  // Consumir la nueva línea

         switch (opcion) {
             case 1:
                 System.out.print("Ingrese el tipo de libro (1. Físico, 2. Digital): ");
                 int tipoLibro = scanner.nextInt();
                 scanner.nextLine();  // Consumir la nueva línea
                 System.out.print("Ingrese el título: ");
                 String titulo = scanner.nextLine();
                 System.out.print("Ingrese el autor: ");
                 String autor = scanner.nextLine();
                 System.out.print("Ingrese el género: ");
                 String genero = scanner.nextLine();

                 if (tipoLibro == 1) {
                     System.out.print("Ingrese la ubicación: ");
                     String ubicacion = scanner.nextLine();
                     System.out.print("Ingrese el número de páginas: ");
                     int numPaginas = scanner.nextInt();
                     scanner.nextLine();  // Consumir la nueva línea
                     biblioteca.agregarLibro(new LibroFisico(titulo, autor, genero, true, ubicacion, numPaginas));
                 } else {
                     System.out.print("Ingrese el tamaño del archivo (MB): ");
                     double tamañoArchivo = scanner.nextDouble();
                     scanner.nextLine();  // Consumir la nueva línea
                     System.out.print("Ingrese el formato del archivo: ");
                     String formato = scanner.nextLine();
                     biblioteca.agregarLibro(new LibroDigital(titulo, autor, genero, true, tamañoArchivo, formato));
                 }
                 break;
             case 2:
                 biblioteca.listarLibros();
                 break;
             case 3:
                 System.out.print("Ingrese el título del libro: ");
                 String tituloBuscar = scanner.nextLine();
                 biblioteca.buscarLibro(tituloBuscar);
                 break;
             case 4:
                 System.out.print("Ingrese el título del libro: ");
                 String tituloPrestar = scanner.nextLine();
                 biblioteca.prestarLibro(tituloPrestar);
                 break;
             case 5:
                 System.out.print("Ingrese el título del libro: ");
                 String tituloDevolver = scanner.nextLine();
                 biblioteca.devolverLibro(tituloDevolver);
                 break;
             case 6:
                 System.out.println("Saliendo...");
                 break;
             default:
                 System.out.println("Opción no válida.");
         }
     } while (opcion != 6);

     scanner.close();
 }
}


	