package Ejs14Oct24;

public class Ejercicio10 {
	public static void main(String[] args) {
		// Crear un array de 5 números
		int[] numeros = { 1, 2, 3, 4, 5 };

		// Almacenar el último elemento
		int ultimo = numeros[numeros.length - 1];

		// Mover todos los demás elementos una posición hacia la derecha
		for (int i = numeros.length - 1; i > 0; i--) {
			numeros[i] = numeros[i - 1];
		}

		// Colocar el último elemento en la primera posición
		numeros[0] = ultimo;

		// Imprimir el array resultante
		System.out.println("Array rotado: " + java.util.Arrays.toString(numeros));
	}
}
