package Ejs9Oct24;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int numero = scanner.nextInt();
		scanner.close();

		if (esNumeroPerfecto(numero)) {
			System.out.println(numero + " es un número perfecto.");
		} else {
			System.out.println(numero + " no es un número perfecto.");
		}
	}

	public static boolean esNumeroPerfecto(int numero) {
		int suma = 0;
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				suma += i;
			}
		}
		return suma == numero;
	}
}