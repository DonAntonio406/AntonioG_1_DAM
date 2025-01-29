package ArraysDinamicos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
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

		// Paso 3: Invertir el ArrayList
		Collections.reverse(numeros);

		// Imprimir el ArrayList en orden inverso
		System.out.println("ArrayList en orden inverso: " + numeros);
	}
}
