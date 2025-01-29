package calculadora;

public class Calculadora {

	private int numero1;
	private String operador;
	private int numero2;

	/*
	 * El constructor recibe unos argumentos o parámetros desde el objeto
	 */

	// si hago un constructor con parametros, en la clase calculadora los tengo que
	// inicializar

	// Parámetros enviados desde la clase main
	public Calculadora(int numero1, String operador, int numero2) {
		// Atributos //Parametros
		this.numero1 = numero1;
		this.operador = operador;
		this.numero2 = numero2;
	}

}
