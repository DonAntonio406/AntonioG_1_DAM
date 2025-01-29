package alumno;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Creamos el objeto Alumno

		Alumno alumno = new Alumno();

		// Ingresar datos del alumno

		System.out.println("Ingrese el nombre del alumno: ");
		alumno.setNombre(sc.nextLine());

		System.out.println("Ingrese los apellidos del alumno: ");
		alumno.setApellidos(sc.nextLine());

		System.out.println("Ingrese el dni del alumno: ");
		alumno.setDni(sc.nextLine());

		System.out.println("Ingrese la edad del alumno: ");
		alumno.setEdad(sc.nextInt());

		// Mostrar datos del alumno

		System.out.println("Datos del alumno:");
		System.out.println("Nombre: " + alumno.getNombre());
		System.out.println("Apellidos: " + alumno.getApellidos());
		System.out.println("DNI: " + alumno.getDni());
		System.out.println("Edad: " + alumno.getEdad());
	}

}
