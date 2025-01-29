package debugEjercicos;

public class debugging {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;

		System.out.println("Suma: " + sumar(a, b));
		System.out.println("Resta: " + restar(a, b));
		System.out.println("Multiplicación: " + multiplicar(a, b));

		try {
			System.out.println("División: " + dividir(a, b));
		} catch (java.lang.ArithmeticException e) {
			System.out.println("introduce un divisor que no sea 0");

		}
	}

	public static int sumar(int x, int y) {
		return x + y;
	}

	public static int restar(int x, int y) {
		return x - y;
	}

	public static int multiplicar(int x, int y) {
		return x * y;
	}

	public static int dividir(int x, int y) {
		// Error: posible división por cero
		return x / y;

	}

}
