package Ejs14Oct24;

public class Ejercicio4 {
	public static void main(String[] args) {
		int[] arrayNumeros = { 94, 17, 73, 42, 65 };
		// Crear un array para el array invertido
		int[] arrayInvertido = new int[arrayNumeros.length]; // Sabemos que el tamaño es 5

		// Usar un bucle para recorrer el array original desde el final hasta el
		// principio
		for (int i = 0; i < arrayNumeros.length; i++) {
			arrayInvertido[i] = arrayNumeros[4 - i]; // 4 es el índice del último elemento
		}

		// Imprimir el nuevo array invertido
		System.out.print("Array invertido: ");
		for (int num : arrayInvertido) {
			System.out.print(num + " ");
		}
	}
}