package Ejs9Oct24;

import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce una cadena de texto: ");
		String cadena = scanner.nextLine();
		scanner.close();

		int contadorVocales = 0;
		for (int i = 0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			if (esVocal(c)) {
				contadorVocales++;
			}
		}

		System.out.println("La cadena contiene " + contadorVocales + " vocales.");
	}

	public static boolean esVocal(char c) {
		c = Character.toLowerCase(c);
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
}