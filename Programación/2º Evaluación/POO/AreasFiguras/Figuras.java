package AreasFiguras;

import java.util.Scanner;

public class Figuras {

	public static void main(String[] args) {

		Rectangulo rectangulo = new Rectangulo();
		Circulo circulo = new Circulo();
		Triangulo triangulo = new Triangulo();

		Scanner sc = new Scanner(System.in);

		System.out.println("1. Circulo");
		System.out.println("2. Triangulo");
		System.out.println("3. Rectangulo");
		System.out.println("¿Con qué figura quieres trabajar?, introduzca un numero");
		int respuesta = sc.nextInt();

		switch (respuesta) {

		case 1:
			System.out.println("Introduzca el radio: ");
			double radio = sc.nextDouble();
			circulo.setRadio(radio);

			circulo.MostrarPorPantalla();

			break;

		case 2:

			System.out.println("Introduzca la base: ");
			double base = sc.nextDouble();
			triangulo.setBase(base);

			System.out.println("Introduzca el lado 1: ");
			double lado1 = sc.nextDouble();
			triangulo.setLado1(lado1);

			System.out.println("Introduzca el lado 2: ");
			double lado2 = sc.nextDouble();
			triangulo.setLado2(lado2);

			System.out.println("Introduzca la altura: ");
			double altura = sc.nextDouble();
			triangulo.setAltura(altura);

			triangulo.MostrarPorPantalla();

			break;

		case 3:

			System.out.println("Introduzca la base: ");
			double base2 = sc.nextDouble();
			rectangulo.setBase(base2);

			System.out.println("Introduzca la altura: ");
			double altura2 = sc.nextDouble();
			rectangulo.setAltura(altura2);

			break;
		}

	}

}
