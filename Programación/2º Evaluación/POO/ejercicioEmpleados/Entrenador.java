package ejercicioEmpleados;

import java.util.Scanner;

public class Entrenador extends Empleado {

	private int idFederacion;

	// constructores

	public Entrenador() {

	}

	public Entrenador(int idFederacion) {
		this.idFederacion = idFederacion;
	}

	// get y set

	public int getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(int idFederacion) {
		this.idFederacion = idFederacion;
	}

	// metodo para pedir datos y hereda de empleado
	void PedirDatos() {

		super.PedirDatos();

		Scanner sc = new Scanner(System.in);

		System.out.println("ID Federacion: ");
		idFederacion = sc.nextInt();

	}

	// metodo para mostrar datos y hereda de empleado los datos

	void MostrarDatos() {
		super.MostrarDatos();
		System.out.println("ID Federacion: " + idFederacion);
	}
}
