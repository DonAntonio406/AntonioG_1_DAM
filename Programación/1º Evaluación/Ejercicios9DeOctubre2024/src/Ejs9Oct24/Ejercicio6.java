package Ejs9Oct24;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario un número entero
		System.out.print("Introduce un número entero: ");
		int numero = scanner.nextInt();

		// Inicializar el contador de dígitos
		int contador = 0;

		// Si el número es 0, tiene un dígito
		if (numero == 0) {
			contador = 1;
		} else {
			// Utilizar un bucle para contar los dígitos
			while (numero != 0) {
				numero /= 10; // Dividir el número por 10
				contador++; // Incrementar el contador
			}
		}

		// Mostrar el resultado
		System.out.println("El número tiene " + contador + " dígitos.");

		// Cerrar el objeto Scanner
		scanner.close();

	}
}
