package Parcial;

//Clase Hija: LibroFisico
class LibroFisico extends Libro {
 private String ubicacion;
 private int numPaginas;

 public LibroFisico(String titulo, String autor, String genero, boolean disponible, String ubicacion, int numPaginas2) {
     super(titulo, autor, genero, disponible);
     this.ubicacion = ubicacion;
     this.numPaginas = numPaginas2;
 }

 @Override
 public void mostrarInfo() {
     super.mostrarInfo();
     System.out.println("Ubicación: " + ubicacion);
     System.out.println("Número de Páginas: " + numPaginas);
 }
}


