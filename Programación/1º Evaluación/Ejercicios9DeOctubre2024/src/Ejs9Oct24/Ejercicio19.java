package Ejs9Oct24;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String[] args) {
		Random random = new Random();
		int numeroSecreto = random.nextInt(100) + 1;
		Scanner scanner = new Scanner(System.in);
		int intentos = 5;
		boolean adivinado = false;

		System.out.println("¡Bienvenido al juego de adivinanza!");
		System.out.println("He pensado en un número entre 1 y 100. Tienes " + intentos + " intentos para adivinarlo.");

		for (int i = 0; i < intentos; i++) {
			System.out.print("Introduce tu intento (" + (i + 1) + "/" + intentos + "): ");
			int intento = scanner.nextInt();

			if (intento == numeroSecreto) {
				System.out.println("¡Felicidades! Has adivinado el número.");
				adivinado = true;
				break;
			} else if (intento < numeroSecreto) {
				System.out.println("El número es mayor.");
			} else {
				System.out.println("El número es menor.");
			}
		}

		if (!adivinado) {
			System.out.println("Lo siento, no has adivinado el número. El número era: " + numeroSecreto);
		}

		scanner.close();
	}
}
