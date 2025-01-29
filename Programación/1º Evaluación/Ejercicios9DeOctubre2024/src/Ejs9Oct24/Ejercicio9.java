package Ejs9Oct24;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// Inicializar las sumas de pares e impares
		int sumaPares = 0;
		int sumaImpares = 0;

		// Solicitar 10 números al usuario
		for (int i = 1; i <= 10; i++) {
			System.out.print("Introduce el número " + i + ": ");
			int numero = scanner.nextInt();

			// Verificar si el número es par o impar y sumar en consecuencia
			if (numero % 2 == 0) {
				sumaPares += numero;
			} else {
				sumaImpares += numero;
			}
		}

		// Mostrar los resultados
		System.out.println("La suma de los números pares es: " + sumaPares);
		System.out.println("La suma de los números impares es: " + sumaImpares);

		// Cerrar el objeto Scanner
		scanner.close();
	}
}