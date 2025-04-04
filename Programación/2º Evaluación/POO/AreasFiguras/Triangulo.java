package AreasFiguras;

public class Triangulo {

	private double base;
	private double lado1;
	private double lado2;
	private double altura;

	// constructores-------------------------------------

	public Triangulo() {

	}

	public Triangulo(double base, double lado1, double lado2, double altura) {
		this.base = base;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.altura = altura;
	}

	// getters y setters----------------------------------------

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// metodos area y perimetro---------------------------------------

	public double CalcularPerimetro() {

		double perimetro = base + lado1 + lado2;

		return perimetro;
	}

	public double CalcularArea() {
		double area = (base * altura) / 2;
		return area;
	}

	void MostrarPorPantalla() {
		System.out.println("El area del triangulo es: " + CalcularArea());
		System.out.println("El perímetro del triangulo es: " + CalcularPerimetro());
	}

}
