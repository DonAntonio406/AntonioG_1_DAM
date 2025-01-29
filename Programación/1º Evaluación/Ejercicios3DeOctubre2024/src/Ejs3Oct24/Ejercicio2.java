package Ejs3Oct24;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el primer número entero: ");
		int num1 = scanner.nextInt();
		System.out.print("Introduce el segundo número entero: ");
		int num2 = scanner.nextInt();
		System.out.print("Introduce el tercer número entero: ");
		int num3 = scanner.nextInt();
		if (num1 == num2 && num2 == num3) {
			System.out.println("Todos los números son iguales.");
			} else if (num1 >= num2 && num1 >= num3) {
			System.out.println("El número mayor es: " + num1);
			} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("El número mayor es: " + num2);
			} else {
			System.out.println("El número mayor es: " + num3);
			}
			}
			}