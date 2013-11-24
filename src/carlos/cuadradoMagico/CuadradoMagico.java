/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlos.cuadradoMagico;

import carlos.cuadradoMagico.ejecutor.Ejecutor;
import carlos.cuadradoMagico.repartidor.Matriz;
import java.util.Date;

/**
 *
 * @author Pakno
 */
public class CuadradoMagico {

    public static void main(String args[]) {
        Date horaInicio;
        Date horaFin;
        long tiempoDeCalculo;
        Matriz matriz;

        horaInicio = new Date();

        matriz = Ejecutor.ejecutarCalculo(10);

        horaFin = new Date();
        
        System.out.println("Encontrado!!!!--------> "+matriz);

        tiempoDeCalculo = (horaFin.getTime() - horaInicio.getTime()) / 1000;

        System.out.println("Segundos de calculo: " + tiempoDeCalculo);
    }
}
