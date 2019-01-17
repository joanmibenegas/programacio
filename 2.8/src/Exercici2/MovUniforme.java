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
public class MovUniforme {
    private double vel;
    
    MovUniforme(double vel) {
        this.vel = vel;
    }

    MovUniforme(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    double recorrido(double t) {
        return vel * t;
    }
}
