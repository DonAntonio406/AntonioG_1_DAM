package ArraysDinamicos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		ArrayList<Integer> pares = new ArrayList<>();
		ArrayList<Integer> impares = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int numero;

		// Paso 1 y 2: Agregar números al ArrayList
		System.out.println("Ingresa números (un número negativo para terminar):");
		while (true) {
			numero = scanner.nextInt();
			if (numero < 0) {
				break;
			}
			numeros.add(numero);
		}

		// Paso 3: Filtrar números pares e impares
		for (int num : numeros) {
			if (num % 2 == 0) {
				pares.add(num);
			} else {
				impares.add(num);
			}
		}

		// Paso 4: Imprimir ambos arrays por separado
		System.out.println("Numeros pares" + pares);
		System.out.println("Numeros pares" + impares);
	}
}