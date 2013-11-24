/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlos.cuadradoMagico.condicionador;

import carlos.cuadradoMagico.repartidor.Matriz;

/**
 *
 * @author Pakno
 */
public class Condicionador {

    public static boolean cumpleCondicion(Condicion condicion, Matriz matriz, int valorCondicion) {

        int sumaParcial = 0;
        boolean cumpleCondicion;

        //Para cada posicion de la condicion
        for (Posicion posicion : condicion.getPosiciones()) {
            sumaParcial += matriz.getCuadrado()[posicion.getX()][posicion.getY()];
        }
 
      //  System.out.println("Condicion: "+condicion+" suma: "+sumaParcial+" ");
        
        cumpleCondicion = sumaParcial == valorCondicion;

        return cumpleCondicion;
    }
}
