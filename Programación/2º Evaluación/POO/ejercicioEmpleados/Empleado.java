package ejercicioEmpleados;

import java.util.Scanner;

public class Empleado {

	String nombre;
	String dni;
	int anio;

	void EscribirFichero() {
		System.out.println("Este metodo seria para escribir fichero");
	}

	void PedirDatos() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nombre: ");
		nombre = sc.nextLine();

		System.out.print("DNI: ");
		dni = sc.nextLine();

		System.out.print("Año: ");
		anio = sc.nextInt();
	}

	void MostrarDatos() {

		System.out.println("Nombre: " + nombre);
		System.out.println("Dni: " + dni);
		System.out.println("Año: " + anio);

	}

}
