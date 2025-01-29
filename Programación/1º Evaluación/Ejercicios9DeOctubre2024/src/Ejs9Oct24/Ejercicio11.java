package Ejs9Oct24;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// Crear un objeto Random para generar un número aleatorio
		Random random = new Random();
		int numeroAleatorio = random.nextInt(100) + 1; // Generar un número entre 1 y 100

		int intento;
		boolean adivinado = false;

		System.out.println("¡Bienvenido al juego de adivinanza de números!");
		System.out.println("He generado un número entre 1 y 100. ¡Intenta adivinarlo!");

		// Bucle para que el usuario intente adivinar el número
		while (!adivinado) {
			System.out.print("Introduce tu intento: ");
			intento = scanner.nextInt();

			if (intento < numeroAleatorio) {
				System.out.println("El número es mayor que " + intento + ". Intenta de nuevo.");
			} else if (intento > numeroAleatorio) {
				System.out.println("El número es menor que " + intento + ". Intenta de nuevo.");
			} else {
				System.out.println("¡Felicidades! Has adivinado el número.");
				adivinado = true;
			}
		}

		// Cerrar el objeto Scanner
		scanner.close();
	}
}
