package Ejs14Oct24;

public class Ejercicio6 {
	public static void main(String[] args) {
		// Crear un array de 6 números flotantes
		float[] numeros = { 1.5f, 2.3f, 4.7f, 3.6f, 5.2f, 6.1f };

		// Calcular la suma total de los elementos
		float suma = 0;
		for (float numero : numeros) {
			suma += numero;
		}

		// Calcular el promedio
		float promedio = suma / numeros.length;

		// Mostrar el resultado
		System.out.println("El promedio de los números es: " + promedio);
	}
}