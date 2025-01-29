package ejercicioEmpleados;

public class PruebaMain {

	public static void main(String[] args) {

		Jugadores jugadores = new Jugadores();
		Masajista masajistas = new Masajista();
		Entrenador entrenadores = new Entrenador();

		// pedir y mostrar datos de jugadores

		System.out.println("Ingrese datos del jugador:");
		jugadores.PedirDatos();

		System.out.println("Datos del jugador: ");
		jugadores.MostrarDatos();

		// Pedir y mostrar datos de masajistas

		System.out.println("Ingrese datos del masajista:");
		masajistas.PedirDatos();

		System.out.println("Datos del masajista: ");
		masajistas.MostrarDatos();

		// pedir datos de entrenadores

		System.out.println("Ingrese datos del entrenador:");
		entrenadores.PedirDatos();

		System.out.println("Datos del entrenador: ");
		entrenadores.MostrarDatos();
	}

}
