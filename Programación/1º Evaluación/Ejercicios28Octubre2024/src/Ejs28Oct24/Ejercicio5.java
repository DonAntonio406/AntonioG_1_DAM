package Ejs28Oct24;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Ingresa el numerador: ");
			int numerador = scanner.nextInt();
			System.out.print("Ingresa el denominador: ");
			int denominador = scanner.nextInt();
			double resultado = numerador / denominador;
			System.out.println("El resultado es: " + resultado);
		} catch (InputMismatchException e) {
			System.out.println("Error: Debes ingresar un número entero.");
		} catch (ArithmeticException e) {
			System.out.println("Error: No se puede dividir por cero.");
		} finally {
			scanner.close();
		}
	}
}