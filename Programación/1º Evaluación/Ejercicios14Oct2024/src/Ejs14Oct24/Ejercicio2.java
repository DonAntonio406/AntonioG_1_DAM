package Ejs14Oct24;

public class Ejercicio2 {
	public static void main(String[] args) {
		int[] numeros = { 14, 22, 30, 38, 46 };
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}

		System.out.println("La suma de todos los elementos del array es: " + suma);
	}
}
