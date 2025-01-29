package Ejs9Oct24;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce la cantidad de números: ");
		int n = scanner.nextInt();

		double suma = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Introduce el número " + (i + 1) + ": ");
			double numero = scanner.nextDouble();
			suma += numero;
		}
		scanner.close();

		double promedio = suma / n;
		System.out.println("El promedio de los números introducidos es: " + promedio);
	}
}