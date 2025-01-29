package Ejs21Oct24;

import javax.swing.JSpinner;

public class Ejercicio1ArrayComplejidad {
	Scanner scanner = new Scanner(System.in);

	// Solicitar el tamaño de la matriz
	System.out.print("Ingresa el número de filas (m): ");
	int m = scanner.nextInt();System.out.print("Ingresa el número de columnas (n): ");
	int n = scanner.nextInt();

	// Crear la matriz
	int[][] matriz = new int[m][n];

	// Llenar la matriz con valores ingresados por el usuario
	System.out.println("Ingresa los elementos de la matriz:");for(
	int i = 0;i<m;i++)
	{
		for (int j = 0; j < n; j++) {
			int i1;
			System.out.print("Elemento [" + i1 + "][" + j + "]: ");
			matriz[i1][j] = JSpinner.nextInt();
		}
	}

	// Calcular la suma de todos los elementos de la matriz
	int suma = 0;for(
	int i = 0;i<m;i++)
	{
		for (int j = 0; j < n; j++) {
			suma += matriz[i1][j];
		}
	}

	// Mostrar la suma de los elementos
	System.out.println("La suma de todos los elementos de la matriz es: "+suma);
}}