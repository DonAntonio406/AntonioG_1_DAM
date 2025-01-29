package Ejs14Oct24;

import java.util.Arrays;

public class Ejercicio8 {
	public static void main(String[] args) {
		// Crear dos arrays de enteros
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 6, 7, 8, 9, 10 };

		// Fusionar los dos arrays en uno solo
		int[] arrayFusionado = new int[array1.length + array2.length];
		System.arraycopy(array1, 0, arrayFusionado, 0, array1.length);
		System.arraycopy(array2, 0, arrayFusionado, array1.length, array2.length);

		// Imprimir el nuevo array resultante
		System.out.println("Array fusionado: " + Arrays.toString(arrayFusionado));
	}
}