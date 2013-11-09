/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlos.cuadradoMagico.condicionador;

/**
 * Condiciones que debe cumplir la matriz. Cada condicionen consta de cuatro posiciones de la matriz,
 * que serán las que deban sumar 64
 * @author Pakno
 */
public enum Condicion {

    PRIMERA_FILA(new Posicion(0, 0), new Posicion(0, 1), new Posicion(0, 2), new Posicion(0, 3)),
    SEGUNDA_FILA(new Posicion(1, 0), new Posicion(1, 1), new Posicion(1, 2), new Posicion(1, 3)),
    TERCERA_FILA(new Posicion(2, 0), new Posicion(2, 1), new Posicion(2, 2), new Posicion(2, 3)),
    CUARTA_FILA(new Posicion(3, 0), new Posicion(3, 1), new Posicion(3, 2), new Posicion(3, 3)),
    PRIMERA_COLUMNA(new Posicion(0, 0), new Posicion(1, 0), new Posicion(2, 0), new Posicion(3, 0)),
    SEGUNDA_COLUMNA(new Posicion(0, 1), new Posicion(1, 1), new Posicion(2, 1), new Posicion(3, 1)),
    TERCERA_COLUMNA(new Posicion(0, 2), new Posicion(1, 2), new Posicion(2, 2), new Posicion(3, 2)),
    CUARTA_COLUMNA(new Posicion(0, 3), new Posicion(1, 3), new Posicion(2, 3), new Posicion(3, 3)),
    CUADRADO_CENTRAL(new Posicion(1, 1), new Posicion(1, 2), new Posicion(2, 1), new Posicion(2, 2));

    private final Posicion posiciones[] = new Posicion[4];

    Condicion(Posicion posicion0, Posicion posicion1, Posicion posicion2, Posicion posicion3) {
        
        posiciones[0] = posicion0;
        posiciones[1] = posicion1;
        posiciones[2] = posicion2;
        posiciones[3] = posicion3;
    }

    public Posicion[] getPosiciones() {
        return posiciones;
    }

}
