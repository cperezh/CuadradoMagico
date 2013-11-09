/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlos.cuadradoMagico.repartidor;

import java.util.Random;

/**
 *
 * @author Pakno
 */
public class Repartidor {

    private static final Matriz matriz = new Matriz();

    /**
     * Reparte numeros aleatorios entre 1 y el valorMaximo sobre una cuadrado
     *
     * @param valorMaximo el numero mas alto que se va a utilizar para repartir
     * @return el cuadrado
     */
    public static Matriz repartirNumeros(int valorMaximo) {

        for (Integer filas[] : matriz.getCuadrado()) {
            for (int i = 0; i < filas.length; i++) {
                filas[i] = generarNumeroAleatorio(valorMaximo);
            }
        }

        return matriz;
    }

    private static int generarNumeroAleatorio(int valorMaximo) {

        int aleatorio;
        Random generador = new Random();

        aleatorio = generador.nextInt(valorMaximo) + 1;

        return aleatorio;
    }
}
