package artistas;

import java.util.ArrayList;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Canciones> canciones = new ArrayList<>();

		int respuesta = 0;

		do {

			System.out.println("Seleccione una opcion: ");
			System.out.println("1. Dar de alta una canción");
			System.out.println("2. Mostrar listado de canciones añadidas");
			System.out.println("3. Salir");
			respuesta = sc.nextInt();

			switch (respuesta) {

			case 1:

				break;

			case 2:

				break;

			case 3:

				break;

			default:
				System.out.println("Seleccione un numero de la lista");
			}

		} while (respuesta != 3);

		sc.close();

		// Método para dar de alta una nueva canción

	}

	public static void altaCancion(Scanner sc) {
		System.out.println("Introduzca la cancion a registrar: ");
		String song = sc.nextLine();
	}
}
