package ArraysDinamicos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
// 1. Crear un ArrayList de enteros
		ArrayList<Integer> numeros = new ArrayList<>();

// 2. Permitir al usuario ingresar 5 números enteros
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa 5 números enteros:");

		for (int i = 0; i < 5; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			int numero = scanner.nextInt();
// 3. Agregar los números al ArrayList
			numeros.add(numero);
		}

// 4. Imprimir el contenido del ArrayList
		System.out.println("Contenido del ArrayList: " + numeros);
	}
}
