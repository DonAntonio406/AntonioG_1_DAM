package Ejs9Oct24;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario un número entero positivo
		System.out.print("Introduce un número entero positivo: ");
		int numero = scanner.nextInt();

		// Inicializar el factorial en 1
		long factorial = 1;

		// Verificar que el número sea positivo
		if (numero < 0) {
			System.out.println("El número debe ser positivo.");
		} else {
			// Calcular el factorial utilizando un bucle
			for (int i = 1; i <= numero; i++) {
				factorial *= i;
			}

			// Mostrar el resultado
			System.out.println("El factorial de " + numero + " es " + factorial);
		}

		// Cerrar el objeto Scanner
		scanner.close();
	}
}
