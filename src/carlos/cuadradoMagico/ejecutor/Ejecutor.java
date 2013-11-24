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

    public static Matriz ejecutarCalculo(int valorCalculo) {

        Matriz matriz;
        Condicion condiciones[];
        boolean cumpleTodasLasCondiciones;
        boolean encontrado;
        int i;

        encontrado = false;
        matriz = null;

        while (!encontrado) {

            matriz = Repartidor.repartirNumeros(valorCalculo / 2);

            condiciones = Condicion.values();

            i = 0;

            cumpleTodasLasCondiciones = true;

            while (cumpleTodasLasCondiciones && i < condiciones.length) {

                if (!Condicionador.cumpleCondicion(condiciones[i], matriz, valorCalculo)) {
                    cumpleTodasLasCondiciones = false;
                } else {
                    i++;
                }
            }

            if (cumpleTodasLasCondiciones) {
                encontrado = true;

            }

            System.gc();
        }

        return matriz;
    }
}
