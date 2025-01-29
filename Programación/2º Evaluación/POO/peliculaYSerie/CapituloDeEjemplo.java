package peliculaYSerie;

public class CapituloDeEjemplo {

	private int numero;
	private int duracion;

	// constructores---------------------------------------------------------------------------------

	public CapituloDeEjemplo() {
	}

	public CapituloDeEjemplo(int numero, int duracion) {
		this.numero = numero;
		this.duracion = duracion;
	}

	// getters y
	// setters------------------------------------------------------------------------------

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

}
