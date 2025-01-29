package ArraysDinamicos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio6 {
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

		// Paso 2: Eliminar duplicados usando un HashSet
		HashSet<Integer> numerosSinDuplicados = new HashSet<>(numeros);
		numeros.clear();
		numeros.addAll(numerosSinDuplicados);

		// Paso 3: Imprimir el ArrayList sin duplicados
		System.out.println("ArrayList sin duplicados: " + numeros);
	}
}
