package Ejs14Oct24;

import java.util.Random;

public class Ejercicio7 {
	public static void main(String[] args) {
		// Crear un array de 10 números aleatorios
		int[] numeros = new int[10];
		Random random = new Random();

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(100); // Números aleatorios entre 0 y 99
		}

		// Imprimir el array original
		System.out.println("Array original: " + java.util.Arrays.toString(numeros));

		// Ordenar el array usando el algoritmo de burbuja
		for (int i = 0; i < numeros.length - 1; i++) {
			for (int j = 0; j < numeros.length - 1 - i; j++) {
				if (numeros[j] > numeros[j + 1]) {
					// Intercambiar numeros[j] y numeros[j + 1]
					int temp = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = temp;
				}
			}
		}

		// Imprimir el array ordenado
		System.out.println("Array ordenado: " + java.util.Arrays.toString(numeros));
	}
}
