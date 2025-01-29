package ArraysDinamicos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		// 1. Crear un ArrayList de enteros y permitir al usuario agregar 10 números
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa 10 números enteros:");

		for (int i = 0; i < 10; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			int numero = scanner.nextInt();
			numeros.add(numero);
		}

		// 2. Pedir al usuario un número a buscar en el ArrayList
		System.out.println("Ingresa un número para buscar en el ArrayList:");
		int numeroABuscar = scanner.nextInt();

		// 3. Buscar el número y mostrar el resultado
		int indice = numeros.indexOf(numeroABuscar);
		if (indice != -1) {
			System.out.println("El número " + numeroABuscar + " se encuentra en el índice: " + indice);
		} else {
			System.out.println("El número " + numeroABuscar + " no está presente en el ArrayList.");
		}
	}
}