package Ejs9Oct24;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario un número entero
		System.out.print("Introduce un número entero: ");
		int numero = scanner.nextInt();

		// Mostrar la tabla de multiplicar del 1 al 10
		System.out.println("Tabla de multiplicar del " + numero + ":");
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
		}

		// Cerrar el objeto Scanner
		scanner.close();
	}
}
