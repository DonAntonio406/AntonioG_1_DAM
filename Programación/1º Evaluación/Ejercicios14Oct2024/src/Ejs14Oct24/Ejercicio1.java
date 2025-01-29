package Ejs14Oct24;

public class Ejercicio1 {
	public static void main(String[] args) {
		int[] numeros = new int[10];

		// Llenar el array con los valores del 1 al 10
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
		}

		// Imprimir todos los elementos del array
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
}