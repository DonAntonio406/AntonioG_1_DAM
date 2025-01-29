package Parcial;
	
//Clase Hija: LibroDigital
class LibroDigital extends Libro {
 private double tamañoArchivo;
 private String formato;

 public LibroDigital(String titulo, String autor, String genero, boolean disponible, double tamañoArchivo2, String formato) {
     super(titulo, autor, genero, disponible);
     this.tamañoArchivo = tamañoArchivo2;
     this.formato = formato;
 }

 @Override
 public void mostrarInfo() {
     super.mostrarInfo();
     System.out.println("Tamaño de Archivo: " + tamañoArchivo + " MB");
     System.out.println("Formato: " + formato);
 }
}
	