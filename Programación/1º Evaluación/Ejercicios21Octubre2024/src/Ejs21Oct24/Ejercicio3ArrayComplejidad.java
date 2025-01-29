package Ejs21Oct24;

public class Ejercicio3ArrayComplejidad {
	Scanner scanner = new Scanner(System.in);

	// Solicitar el tamaño de la matriz
	System.out.print("Ingresa el número de filas (m): ");
	int m = scanner.nextInt();System.out.print("Ingresa el número de columnas (n): ");
	int n = scanner.nextInt();

	// Crear la matriz
	int[][] matriz = new int[m][n];

	// Llenar la matriz con valores ingresados por el usuario
	System.out.println("Ingresa los elementos de la matriz:");for(int=0;i<m;i++)
	{
		for (int j = 0; j < n; j++) {
			System.out.print("Elemento [" +  + "][" + j + "]: ");
			matriz[][j] = scanner.nextInt();
		}
	}

	// Crear la matriz transpuesta
	int[][] transpuesta = new int[n][m];

	// Realizar la transposición
	for(
	int i = 0;i<m;i++)
	{
		for (int j = 0; j < n; j++) {
			transpuesta[j][] = matriz[][j];
		}
	}

	// Mostrar la matriz transpuesta
	System.out.println("La matriz transpuesta es:");for(int=0;i<n;i++)
	{
		for (int j = 0; j < m; j++) {
			System.out.print(transpuesta[][j] + " ");
		}
		System.out.println();
	}
}}