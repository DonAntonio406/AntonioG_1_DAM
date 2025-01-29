package peliculaYSerie;

public class Serie {

	private String nombre;
	private String genero;
	private int temporadas;

	TemporadaSerie temporadaSerie = new TemporadaSerie(1, 94); // temporada y cap de ejemplo

	TemporadaSerie temporada2Serie = new TemporadaSerie(2, 89);

	CapituloDeEjemplo capituloDeEjemplo = new CapituloDeEjemplo(94, 60);

	// constructores---------------------------------------------------------------------------------

	public Serie() {
	}

	public Serie(String nombre, String genero, int temporadas) {
		this.nombre = nombre;
		this.genero = genero;
		this.temporadas = temporadas;
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

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	// mostrar serie----------------------------

	public void MostrarSerie() {
		System.out.println("Usted quiere consultar información de la serie: " + getNombre());
		System.out.println("->Genero: " + getGenero());
		System.out.println("->Temporadas: " + getTemporadas());
		System.out.println("Temporada 1: " + temporadaSerie.getCapitulos() + " capitulos");
		System.out.println("Temporada 2: " + temporada2Serie.getCapitulos() + " capitulos");
		System.out.println("Temporada 1---capitulo: " + capituloDeEjemplo.getNumero() + "-----duracion: "
				+ capituloDeEjemplo.getDuracion());
	}
}
