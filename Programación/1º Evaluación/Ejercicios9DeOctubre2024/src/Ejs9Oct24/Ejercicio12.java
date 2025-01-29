package Ejs9Oct24;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario un número entero
		System.out.print("Introduce un número entero: ");
		int numero = scanner.nextInt();

		// Inicializar la suma de los dígitos
		int suma = 0;

		// Utilizar un bucle para calcular la suma de los dígitos
		while (numero != 0) {
			int digito = numero % 10; // Obtener el último dígito
			suma += digito; // Añadir el dígito a la suma
			numero /= 10; // Eliminar el último dígito del número original
		}

		// Mostrar el resultado
		System.out.println("La suma de los dígitos es: " + suma);

		// Cerrar el objeto Scanner
		scanner.close();
	}
}
