package Ejs9Oct24;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número entero positivo: ");
		int N = scanner.nextInt();

		int suma = 0;
		for (int i = 1; i <= N; i++) {
			suma += i;
		}

		System.out.println("La suma de los primeros " + N + " números naturales es: " + suma);
	}
}