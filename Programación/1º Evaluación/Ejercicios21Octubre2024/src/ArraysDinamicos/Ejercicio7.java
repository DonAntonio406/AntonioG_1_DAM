package ArraysDinamicos;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio7 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		Random random = new Random();

		// Paso 1 y 2: Llenar el ArrayList con 10 números aleatorios entre 1 y 100
		for (int i = 0; i < 10; i++) {
			numeros.add(random.nextInt(100) + 1);
		}

		// Paso 3: Convertir el ArrayList en un array normal de enteros
		int[] array = new int[numeros.size()];
		for (int i = 0; i < numeros.size(); i++) {
			array[i] = numeros.get(i);
		}

		// Imprimir el array
		System.out.print("Array: ");
		for (int num : array) {
			System.out.print(num + " ");
		}
	}
}
