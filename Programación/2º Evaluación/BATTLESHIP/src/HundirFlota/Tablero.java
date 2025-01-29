package HundirFlota;

import java.util.ArrayDeque;
import java.util.Scanner;

class Tablero {
    private final int tamaño = 10;
    private final char[][] tablero;

    private final char VACÍO = '-';
    private final char BARCO = 'B';
    private final char AGUA = '~';
    private final char ACIERTO = 'X';

    public Tablero() {
        this.tablero = new char[tamaño][tamaño];
        inicializarTablero();
    }

    private void inicializarTablero() {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                tablero[i][j] = VACÍO;
            }
        }
    }

    public boolean colocarBarco(int fila, int columna, int tamaño, char dirección) {
        if (dirección == 'H') {
            if (columna + tamaño > this.tamaño) return false;
            for (int i = 0; i < tamaño; i++) {
                if (tablero[fila][columna + i] != VACÍO) return false;
            }
            for (int i = 0; i < tamaño; i++) {
                tablero[fila][columna + i] = BARCO;
            }
        } else if (dirección == 'V') {
            if (fila + tamaño > this.tamaño) return false;
            for (int i = 0; i < tamaño; i++) {
                if (tablero[fila + i][columna] != VACÍO) return false;
            }
            for (int i = 0; i < tamaño; i++) {
                tablero[fila + i][columna] = BARCO;
            }
        }
        return true;
    }

    public boolean disparar(int fila, int columna) {
        if (tablero[fila][columna] == BARCO) {
            tablero[fila][columna] = ACIERTO;
            return true;
        } else if (tablero[fila][columna] == VACÍO) {
            tablero[fila][columna] = AGUA;
        }
        return false;
    }

    public void mostrarTablero() {
        for (char[] fila : tablero) {
            for (char casilla : fila) {
                System.out.print(casilla + " ");
            }
            System.out.println();
        }
    }
}



