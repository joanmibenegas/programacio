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
public class Trayectoria {
    public static double calcTrayectoria(Exercici29 ... coords) throws Exception {
        double dist = 0.0;
        
        Exercici29 anterior = coords[0];
        
        for (Exercici29 actual : coords) {
            dist += actual.distancia(anterior);
            anterior = actual;
        }
        return dist;
    }
}
