package ejercicioEmpleados;

import java.util.Scanner;

public class Masajista extends Empleado {

	private int numColegiado;

	// constructor

	public Masajista(int numColegiado) {
		this.numColegiado = numColegiado;
	}

	public Masajista() {

	}

	// get y set

	public int getNumColegiado() {
		return numColegiado;
	}

	public void setNumColegiado(int numColegiado) {
		this.numColegiado = numColegiado;
	}

	// metodo para pedir datos y hereda de empleado
	void PedirDatos() {
		super.PedirDatos();
		Scanner sc = new Scanner(System.in);

		System.out.println("Nº colegiado: ");
		numColegiado = sc.nextInt();
	}

	// metodo para mostrar datos y hereda de empleado los datos

	void MostrarDatos() {
		super.MostrarDatos();
		System.out.println("Nº colegiado: " + numColegiado);
	}
}
