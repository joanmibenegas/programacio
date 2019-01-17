/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercici2;

/**
 *
 * @author joanm
 */
public class Movil {
    private Exercici29 posInicial;
    private Exercici29 posAnterior;
    private Exercici29 posActual;
    
    private Recta trayectoria;
    private MovUniforme mov;
    
    Movil(Exercici29 origen, Recta trayectoria, MovUniforme mov) {
        this.posAnterior = this.posActual = this.posInicial = origen;
        this.trayectoria = trayectoria;
        this.mov = mov;
    }
    
    void avanza(double t) {
        Exercici29 intermedio = new Exercici29 (posActual.displayX(),posActual.displayY());
        
        double dist = mov.recorrido (t);
        
        double alfa = trayectoria.pendiente();
        double incrX = dist * Math.cos(alfa);
        double incrY = dist * Math.sin(alfa);
        
        posActual = new Exercici29(posAnterior.displayX() + incrX, posAnterior.displayY() + incrY);
        posAnterior = intermedio;
    }
    Exercici29 posActual(){
        return posActual;
    }

    void avanza(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

