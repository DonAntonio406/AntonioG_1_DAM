package Ejs14Oct24;

public class Ejercicio9 {
	public static void main(String[] args) {
		// Crear un array de caracteres que contenga una cadena
		char[] caracteres = { 'H', 'o', 'l', 'a', ' ', 'm', 'u', 'n', 'd', 'o' };

		// Definir las vocales
		char[] vocales = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

		// Contador de vocales
		int contadorVocales = 0;

		// Recorrer el array de caracteres y contar las vocales
		for (char c : caracteres) {
			for (char v : vocales) {
				if (c == v) {
					contadorVocales++;
					break;
				}
			}
		}

		// Mostrar el resultado
		System.out.println("Número de vocales en el array: " + contadorVocales);
	}
}
