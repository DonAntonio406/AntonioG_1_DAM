package Ejs14Oct24;

public class Ejercicio3 {
	public static void main(String[] args) {
		int[] numeros = { 34, 7, 23, 32, 5, 62, 78, 1, 45, 99 };

		int mayor = numeros[0];
		int menor = numeros[0];

		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}

		System.out.println("El mayor número es: " + mayor);
		System.out.println("El menor número es: " + menor);
	}
}