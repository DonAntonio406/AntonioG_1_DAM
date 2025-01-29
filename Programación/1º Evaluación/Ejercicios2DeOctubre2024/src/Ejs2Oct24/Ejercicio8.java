package Ejs2Oct24;

public class Ejercicio8 {
	public static void main(String[] args) {
		// Declaración e inicialización de booleanas
		boolean ElGatoEsBlanco = true;
	    boolean ElGatoEsGris = false;
	 // Operaciones lógicas
	    boolean andResult = ElGatoEsBlanco && ElGatoEsGris;
	    boolean orResult = ElGatoEsBlanco || ElGatoEsGris;
	    boolean notResult1 = !ElGatoEsBlanco;
	    boolean notResult2 = !ElGatoEsGris;
	    // Impresión de los valores en la consola
	    System.out.println("AND: " + andResult);  // false
	    System.out.println("OR: " + orResult);    // true
	    System.out.println("NOT variable1: " + notResult1);  // false
	    System.out.println("NOT variable2: " + notResult2);  // true
		
		

}
}