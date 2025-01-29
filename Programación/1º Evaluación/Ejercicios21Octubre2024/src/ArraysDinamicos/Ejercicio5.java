package ArraysDinamicos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int numero;

		// Paso 1: Agregar números al ArrayList
		System.out.println("Ingresa números (un número negativo para terminar):");
		while (true) {
			numero = scanner.nextInt();
			if (numero < 0) {
				break;
			}
			numeros.add(numero);
		}

		// Paso 2: Ordenar el ArrayList en orden ascendente
		Collections.sort(numeros);

		// Paso 3: Imprimir el ArrayList ordenado
		System.out.println("ArrayList ordenado: " + numeros);
	}
}