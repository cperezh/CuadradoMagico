/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carlos.cuadradoMagico.condicionador;

/**
 *
 * @author Pakno
 */
public class Posicion {
    
    private int x;
    private int y;

    public Posicion(int _x,int _y) {
        x = _x;
        y = _y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}