package Ejs21Oct24;

import java.util.Scanner;

public class Ejercicio2ArrayComplejidad {
	Scanner scanner = new Scanner(System.in);

	// Solicitar el tamaño de la matriz
	System.out.println("Ingresa el número de filas (m): ");
	int m = scanner.nextInt();System.out.print("Ingresa el número de columnas (n): ");
	int n = scanner.nextInt();

	// Crear la matriz
	int[][] matriz = new int[m][n];

	// Llenar la matriz con valores ingresados por el usuario
	System.out.println("Ingresa los elementos de la matriz:");for(
	int i = 0;i<m;i++)
	{
		for (int j = 0; j < n; j++) {
			System.out.print("Elemento [" + i + "][" + j + "]: ");
			matriz[i][j] = scanner.nextInt();
		}
	}

	// Encontrar la fila con la mayor suma de elementos
	int indiceFilaMaxSuma = 0;
	int maxSuma = Integer.MIN_VALUE;

	for(
	int i = 0;i<m;i++)
	{
		int sumaFila = 0;
		for (int j = 0; j < n; j++) {
			sumaFila += matriz[i][j];
		}
		if (sumaFila > maxSuma) {
			maxSuma = sumaFila;
			indiceFilaMaxSuma = i;
		}
	}

	// Mostrar el índice de la fila con la mayor suma
	System.out.println("La fila con la mayor suma de elementos es la fila: "+indiceFilaMaxSuma);
}}