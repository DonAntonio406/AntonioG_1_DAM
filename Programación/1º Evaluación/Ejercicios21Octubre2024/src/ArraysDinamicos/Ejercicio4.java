package ArraysDinamicos;

public class Ejercicio4 {
	public static void main(String[] args) {
		// 1. Crear un ArrayList de enteros con 10 elementos
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingresa 10 números enteros:");
		for (int i = 0; i < 10; i++) {
		System.out.print("Número " + (i + 1) + ": ");
		int numero = scanner.nextInt();
		numeros.add(numero);
		}

		// 2. Permitir al usuario actualizar el valor de un elemento en una posición específica
		while (true) {
		System.out.println("ArrayList actual: " + numeros);
		System.out.println("Ingresa el índice del elemento que deseas actualizar (0-9) o -1 para salir:");
		int indice scanner.nextint[]
				if break