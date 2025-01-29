package Ejs9Oct24;

public class Ejercicio7 {
	public static void main(String[] args) {
		// Iterar a través de los números del 1 al 100
		for (int numero = 2; numero <= 100; numero++) {
			boolean esPrimo = true;

			// Verificar si el número es primo
			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if (numero % i == 0) {
					esPrimo = false;
					break;
				}
			}

			// Si el número es primo, imprimirlo
			if (esPrimo) {
				System.out.println(numero);
			}
		}
	}
}
