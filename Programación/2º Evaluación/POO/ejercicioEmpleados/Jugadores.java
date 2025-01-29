package ejercicioEmpleados;

import java.util.Scanner;

public class Jugadores extends Empleado {

	private int dorsal;
	private String demarcacion;

	// constructores

	public Jugadores() {

	}

	public Jugadores(int dorsal, String demarcacion) {
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;

		// getters y setters
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	// metodo para pedir datos y hereda de empleado
	void PedirDatos() {
		super.PedirDatos();
		Scanner sc = new Scanner(System.in);
		System.out.println("Dorsal: ");
		dorsal = sc.nextInt();

		System.out.println("Demarcacion: ");
		demarcacion = sc.nextLine();
	}

	// metodo para mostrar datos y hereda de empleado los datos

	void MostrarDatos() {
		super.MostrarDatos();
		System.out.println("dorsal: " + dorsal);
		System.out.println("demarcacion: " + demarcacion);

	}

}
