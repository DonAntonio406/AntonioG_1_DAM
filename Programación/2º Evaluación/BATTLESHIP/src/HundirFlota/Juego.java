package HundirFlota;

import java.util.Scanner;

class Juego {
	
	private final Tablero tablero;
    private final Scanner scanner;

    public Juego() {
        this.tablero = new Tablero();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            mostrarMenu();
            int opción = scanner.nextInt();
            switch (opción) {
                case 1:
                    colocarBarco();
                    break;
                case 2:
                    realizarDisparo();
                    break;
                case 3:
                    mostrarTablero();
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        }
    }

    private void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("1. Colocar barco");
        System.out.println("2. Realizar disparo");
        System.out.println("3. Mostrar tablero");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
    }

    private void colocarBarco() {
        System.out.print("Introduce la fila, columna, tamaño y dirección (H/V): ");
        int fila = scanner.nextInt();
        int columna = scanner.nextInt();
        int tamaño = scanner.nextInt();
        char dirección = scanner.next().charAt(0);

        if (tablero.colocarBarco(fila, columna, tamaño, dirección)) {
            System.out.println("Barco colocado.");
        } else {
            System.out.println("Error al colocar el barco.");
        }
    }

    private void realizarDisparo() {
        System.out.print("Introduce la fila y columna del disparo: ");
        int fila = scanner.nextInt();
        int columna = scanner.nextInt();

        if (tablero.disparar(fila, columna)) {
            System.out.println("¡Acierto!");
        } else {
            System.out.println("¡Agua!");
        }
    }

    private void mostrarTablero() {
        tablero.mostrarTablero();
    }
}
	



