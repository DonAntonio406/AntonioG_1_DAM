package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import utilidadesClases.Calculadora;

public class calculadora {

	@Test
	public void testSuma() {
		Calculadora calc = new Calculadora();
		assertEquals(5, calc.suma(2, 3));

	}

}
