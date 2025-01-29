package Ejs28Oct24;

public class Ejercicio2 {
	// Definición de la excepción personalizada
	class EdadInvalidaException extends Exception {
		public EdadInvalidaException(String mensaje) {
			super(mensaje);
		}
	}

	// Clase Persona con método para establecer la edad
	class Persona {
		private int edad;

		public void setEdad(int edad) throws EdadInvalidaException {
			if (edad < 0) {
				throw new EdadInvalidaException("La edad no puede ser negativa.");
			}
			this.edad = edad;
		}

		public int getEdad() {
			return edad;
		}
	}

	// Clase principal para probar la excepción
	public class Main {
	public static void main(String[] args) {
	Persona persona = new Persona();
	try {
	persona.setEdad(-5); // Esto lanzará la excepción
	} catch (EdadInvalidaException e) {
	System.out.println("Error: " + e.getMessage());
	}
	}
	}