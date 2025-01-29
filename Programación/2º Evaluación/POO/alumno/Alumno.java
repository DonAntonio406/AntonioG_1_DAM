package alumno;

public class Alumno {

	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;

	// constructor por defecto------------------------------------------------

	public Alumno() {
	}

	// constructor con parametros (se utilizaria si se dan valores en el objeto)

	// public Alumno(String nombre, String apellidos, String dni, int edad) {
	// this.nombre = nombre;
	// this.apellidos = apellidos;
	// this.dni = dni;
	// this.edad = edad;
	// }

	// getters----------------------------------------------

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDni() {
		return dni;
	}

	public int getEdad() {
		return edad;
	}

	// setters---------------------------------------------------

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
