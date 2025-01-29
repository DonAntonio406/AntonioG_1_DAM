package Ejs9Oct24;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario el número de términos de la serie de Fibonacci
		System.out.print("Introduce el número de términos de la serie de Fibonacci: ");
		int n = scanner.nextInt();

		// Inicializar los dos primeros términos de la serie
		int a = 0, b = 1;

		// Mostrar los primeros N términos de la serie de Fibonacci
		System.out.println("Los primeros " + n + " términos de la serie de Fibonacci son:");
		for (int i = 1; i <= n; i++) {
			System.out.print(a + " ");

			// Calcular el siguiente término
			int siguiente = a + b;
			a = b;
			b = siguiente;
		}

		// Cerrar el objeto Scanner
		scanner.close();
	}
}
