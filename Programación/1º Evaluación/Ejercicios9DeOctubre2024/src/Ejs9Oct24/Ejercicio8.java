package Ejs9Oct24;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario un número entero
		System.out.print("Introduce un número entero: ");
		int numero = scanner.nextInt();

		// Inicializar la variable para el número invertido
		int numeroInvertido = 0;

		// Utilizar un bucle para invertir el número
		while (numero != 0) {
			int digito = numero % 10; // Obtener el último dígito
			numeroInvertido = numeroInvertido * 10 + digito; // Añadir el dígito al número invertido
			numero /= 10; // Eliminar el último dígito del número original
		}

		// Mostrar el resultado
		System.out.println("El número invertido es: " + numeroInvertido);

		// Cerrar el objeto Scanner
		scanner.close();
	}
}
