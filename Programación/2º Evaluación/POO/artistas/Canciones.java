package artistas;

public class Canciones {
	
	private String nombreCancion;
	private String nombreArtista;
	private int anioPublicacion;
	
	//constructor
	public Canciones(String nombreCancion, String nombreArtista, int anioPublicacion) {
		this.nombreCancion = nombreCancion;
		this.nombreArtista = nombreArtista;
		this.anioPublicacion = anioPublicacion;
	}

	//getters y setters
	
	public String getNombreCancion() {
		return nombreCancion;
	}

	public void setNombreCancion(String nombreCancion) {
		this.nombreCancion = nombreCancion;
	}

	public String getNombreArtista() {
		return nombreArtista;
	}

	public void setNombreArtista(String nombreArtista) {
		this.nombreArtista = nombreArtista;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	
	// Método para mostrar la canción
	
	public void mostrarCancion() {
		System.out.println("Nombre de la canción: " + getNombreCancion());
		System.out.println("Grupo musical: " + getNombreArtista());
		System.out.println("Año de publicación: " + getAnioPublicacion());
		}
}
