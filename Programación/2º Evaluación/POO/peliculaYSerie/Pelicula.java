package peliculaYSerie;

public class Pelicula {

	private String nombre;
	private String genero;
	private int anio;
	private int duracion;

	// constructores---------------------------------------------------------------------------------

	public Pelicula() {
	}

	public Pelicula(String nombre, String genero, int anio, int duracion) {
		this.nombre = nombre;
		this.genero = genero;
		this.anio = anio;
		this.duracion = duracion;
	}

	// getters y
	// setters------------------------------------------------------------------------------

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	// mostrar-------------------------------------------------

	public void MostrarPelicula() {
		System.out.println("Usted quiere consultar información de la pelicula: " + getNombre());
		System.out.println("->Genero: " + getGenero());
		System.out.println("->Año: " + getAnio());
		System.out.println("->Genero: " + getGenero());
		System.out.println("->Duracion: " + getDuracion());
	}
}
