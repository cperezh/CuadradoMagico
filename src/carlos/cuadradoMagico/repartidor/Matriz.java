/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlos.cuadradoMagico.repartidor;

/**
 * Cuadrado de 4x4
 *
 * @author Pakno
 */
public class Matriz {

    private final Integer cuadrado[][] = new Integer[4][4];

    public Matriz() {
        inicializa();
    }

    /**
     * Inicializa la matriz bidimensional de 4x4 a 0.
     */
    public final void inicializa() {

        for (Integer filas[] : cuadrado) {
            //Creo la fila
            filas = new Integer[4];

            for (Integer columna : filas) {
                columna = new Integer(0);
            }
        }
   }

    public Integer[][] getCuadrado() {
        return cuadrado;
    }
    
    @Override
    public String toString(){
        
        StringBuilder stringBuffer = new StringBuilder();
        
         for (Integer filas[] : cuadrado) {
            for (Integer columna : filas) {
                stringBuffer.append(columna).append("|");
            }
             stringBuffer.append("#");
        }
        
        return stringBuffer.toString();
    }
    
    
}
