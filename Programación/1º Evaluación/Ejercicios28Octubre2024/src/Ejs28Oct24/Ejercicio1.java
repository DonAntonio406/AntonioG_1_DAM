package Ejs28Oct24;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		// Pedir al cliente que ingrese un número positivo
		Scanner scanner = new Scanner(System.in);
		boolean validInput = false;
		while (!validInput) {
			try {
				System.out.print("Por favor, ingrese un número positivo: ");
				String input = scanner.nextLine();
				int number = Integer.parseInt(input);

				if (number < 0) {
					throw new IllegalArgumentException("El número no puede ser negativo.");
				}

				System.out.println("¡Gracias! Has ingresado el número positivo: " + number);
				validInput = true;
			} catch (NumberFormatException e) {
				System.out.println("Error: Debes ingresar un número válido.");
			} catch (IllegalArgumentException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}

		scanner.close();
	}
}
