package peliculaYSerie;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Pelicula pelicula = new Pelicula("El rey leon", "infantil", 1994, 88); // pelicula

		Serie serie = new Serie("La reina del flow", "novela", 2); // serie

		TemporadaSerie temporadaSerie = new TemporadaSerie(1, 94); // temporada y cap de ejemplo

		TemporadaSerie temporada2Serie = new TemporadaSerie(2, 89);

		CapituloDeEjemplo capituloDeEjemplo = new CapituloDeEjemplo(94, 60);

		// mostrar por pantalla los datos

		System.out.println("1. El rey leon \n2. La reina del flow");

		System.out.println("Introduzca el numero de la serie o pelicula que quieras consultar: ");

		int consultar = sc.nextInt();

		if (consultar == 1) {

			pelicula.MostrarPelicula();

		} else
			serie.MostrarSerie();

	}

}
