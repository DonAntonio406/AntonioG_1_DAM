package Ejs28Oct24;

public class Ejercicio4 {
	public static void main(String[] args) {
	// Definición de la excepción personalizada
	class DivisionPorCeroException extends Exception {
		public DivisionPorCeroException(String mensaje) {
			super(mensaje);
		}
	}

	// Método para realizar la división
	public static double dividir(double numerador, double denominador) throws DivisionPorCeroException {
		if (denominador == 0) {
			throw new DivisionPorCeroException("No se puede dividir por cero.");
		}
		return numerador / denominador;
	}
		double numerador = 10;
		double denominador = 0;

		try {
			double resultado = dividir(numerador, denominador);
			System.out.println("El resultado de la división es: " + resultado);
		} catch (DivisionPorCeroException e) {
			System.out.println("Error: " + e.getMessage());
		}

		System.out.println("El programa continúa ejecutándose.");
	}
}
