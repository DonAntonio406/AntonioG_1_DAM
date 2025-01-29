package Ejs3Oct24;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int numeroAleatorio = random.nextInt(100) + 1;
		int intento = 0;
		int numeroUsuario;

		System.out.println("¡Adivina el número entre 1 y 100!");

		while (intento != numeroAleatorio) {
		System.out.print("Introduce tu número: ");
		numeroUsuario = scanner.nextInt();

		if (numeroUsuario < numeroAleatorio) {
		System.out.println("El número es mayor.");
		} else if (numeroUsuario > numeroAleatorio) {
		System.out.println("El número es menor.");
		} else {
		System.out.println("¡Felicidades! Has adivinado el número.");
		intento = numeroAleatorio; // Para salir del bucle
		}
		}
		}
		}