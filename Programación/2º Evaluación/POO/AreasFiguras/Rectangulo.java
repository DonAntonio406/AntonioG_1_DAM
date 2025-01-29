package AreasFiguras;

public class Rectangulo {

	private double base;
	private double altura;

	// constructores---------------------------------------------

	public Rectangulo() {

	}

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	// getters and setters------------------------------------------

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// metodos area y perimetro----------------------------------------

	public double CalcularPerimetro() {

		double perimetro = (base * 2) + (altura * 2);
		return perimetro;
	}

	public double CalcularArea() {
		double area = base * altura;
		return area;
	}

	void MostrarPorPantalla() {
		System.out.println("El area del rectangulo es: " + CalcularArea());
		System.out.println("El perímetro del rectangulo es: " + CalcularPerimetro());
	}

}
