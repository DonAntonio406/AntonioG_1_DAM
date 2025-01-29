package Ejs9Oct24;

import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el primer número (A): ");
		int a = scanner.nextInt();
		System.out.print("Introduce el segundo número (B): ");
		int b = scanner.nextInt();
		scanner.close();

		int suma = 0;
		for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
			suma += i;
		}

		System.out.println("La suma de los números entre " + a + " y " + b + " es: " + suma);
	}
}
