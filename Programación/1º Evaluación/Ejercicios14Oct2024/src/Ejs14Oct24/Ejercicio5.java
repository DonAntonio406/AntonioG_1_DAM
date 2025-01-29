package Ejs14Oct24;

import java.util.HashSet;

public class Ejercicio5 {
	public static void main(String[] args) {
		// Crear un array de 10 números enteros
		int[] numeros = { 1, 2, 3, 4, 5, 3, 2, 6, 7, 8 };

		// Usar un conjunto para almacenar los números ya vistos
		HashSet<Integer> vistos = new HashSet<>();
		HashSet<Integer> repetidos = new HashSet<>();

		// Recorrer el array y comprobar números repetidos
		for (int numero : numeros) {
			if (vistos.contains(numero)) {
				repetidos.add(numero);
			} else {
				vistos.add(numero);
			}
		}

		// Imprimir los números repetidos
		System.out.println("Números repetidos: " + repetidos);
	}
}
