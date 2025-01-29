package ArraysDinamicos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		// 1. Crear un ArrayList de cadenas (String)
		ArrayList<String> nombres = new ArrayList<>();

		// 2. Permitir al usuario agregar nombres hasta que ingrese "fin"
		Scanner scanner = new Scanner(System.in);
		String nombre;
		System.out.println("Ingresa nombres (escribe 'fin' para terminar):");

		while (true) {
			nombre = scanner.nextLine();
			if (nombre.equalsIgnoreCase("fin")) {
				break;
			}
			nombres.add(nombre);
		}

		// 3. Imprimir todos los nombres ingresados
		System.out.println("Nombres ingresados: " + nombres);

		// 4. Permitir al usuario eliminar un nombre específico y mostrar la lista
		// actualizada
		System.out.println("Ingresa el nombre que deseas eliminar:");
		String nombreAEliminar = scanner.nextLine();
		if (nombres.remove(nombreAEliminar)) {
			System.out.println("Nombre eliminado.");
		} else {
			System.out.println("Nombre no encontrado.");
		}

		System.out.println("Lista actualizada de nombres: " + nombres);
	}
}