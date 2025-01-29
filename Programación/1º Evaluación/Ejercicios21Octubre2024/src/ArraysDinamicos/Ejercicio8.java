package ArraysDinamicos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {
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

		// Paso 3: Sumar todos los elementos del ArrayList
		int suma = 0;
		for (int num : numeros) {
			suma += num;
		}

		// Mostrar el resultado
		System.out.println("La suma de todos los elementos es: " + suma);
	}
}