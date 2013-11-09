/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlos.cuadradoMagico.ejecutor;

import carlos.cuadradoMagico.condicionador.Condicion;
import carlos.cuadradoMagico.condicionador.Condicionador;
import carlos.cuadradoMagico.repartidor.Matriz;
import carlos.cuadradoMagico.repartidor.Repartidor;

/**
 *
 * @author Pakno
 */
public class Ejecutor {

    public static void ejecutarCalculo(int valorCalculo, int numeroDeIntentos){

        Matriz matriz;
        Condicion condiciones[];
        boolean cumpleCondicion;
        int i;

        while (numeroDeIntentos > 0) {
            
            matriz = Repartidor.repartirNumeros(valorCalculo/2);
            
            System.out.println(numeroDeIntentos+" Matriz-------->"+matriz.toString());

            condiciones = Condicion.values();

            cumpleCondicion = true;

            i = 0;

            while (cumpleCondicion && i < condiciones.length) {

                if (!Condicionador.cumpleCondicion(condiciones[i], matriz, valorCalculo)) {
                    cumpleCondicion = false;
                }
                else{
                    i++;
                }
            }
            
            if (cumpleCondicion){
                System.out.println("Encontrado!!!!--------> ");
            }
            
            numeroDeIntentos = cumpleCondicion ? 0 : numeroDeIntentos-1;
            
           
        }
    }
}
