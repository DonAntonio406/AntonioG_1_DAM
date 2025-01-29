package Ejs3Oct24;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcion;

		do {
		System.out.println("Menú:");
		System.out.println("1. Sumar dos números");
		System.out.println("2. Restar dos números");
		System.out.println("3. Multiplicar dos números");
		System.out.println("4. Dividir dos números");
		System.out.println("5. Salir");
		System.out.print("Elige una opción: ");
		opcion = scanner.nextInt();

		switch (opcion) {
		case 1:
		System.out.print("Introduce el primer número: ");
		int suma1 = scanner.nextInt();
		System.out.print("Introduce el segundo número: ");
		int suma2 = scanner.nextInt();
		System.out.println("Resultado: " + (suma1 + suma2));
		break;
		case 2:
		System.out.print("Introduce el primer número: ");
		int resta1 = scanner.nextInt();
		System.out.print("Introduce el segundo número: ");
		int resta2 = scanner.nextInt();
		System.out.println("Resultado: " + (resta1 - resta2));
		break;
		case 3:
		System.out.print("Introduce el primer número: ");
		int multi1 = scanner.nextInt();
		System.out.print("Introduce el segundo número: ");
		int multi2 = scanner.nextInt();
		System.out.println("Resultado: " + (multi1 * multi2));
		break;
		case 4:
		System.out.print("Introduce el primer número: ");
		int div1 = scanner.nextInt();
		System.out.print("Introduce el segundo número: ");
		int div2 = scanner.nextInt();
		if (div2 != 0) {
		System.out.println("Resultado: " + (div1 / div2));
		} else {
		System.out.println("Error: División por cero no permitida.");
		}
		break;
		case 5:
		System.out.println("Saliendo del programa...");
		break;
		default:
		System.out.println("Opción no válida. Por favor, elige una opción del 1 al 5.");
		}
		} while (opcion != 5);
		}
		}