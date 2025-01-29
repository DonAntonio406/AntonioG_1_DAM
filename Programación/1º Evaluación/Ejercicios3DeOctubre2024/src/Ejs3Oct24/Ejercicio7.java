package Ejs3Oct24;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número entero positivo: ");
		int numero = scanner.nextInt();

		int contador = 0;
		while (numero != 0) {
		numero /= 10;
		contador++;
		}

		System.out.println("El número tiene " + contador + " dígitos.");
		}
		}