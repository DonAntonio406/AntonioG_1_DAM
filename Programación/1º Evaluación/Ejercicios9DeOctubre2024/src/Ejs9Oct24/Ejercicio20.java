package Ejs9Oct24;

public class Ejercicio20 {
	public static void main(String[] args) {
		int suma = 0;
		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				suma += i;
			}
		}
		System.out.println("La suma de todos los múltiplos de 3 y 5 entre 1 y 1000 es: " + suma);
	}
}