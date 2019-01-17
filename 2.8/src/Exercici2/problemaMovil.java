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
public class problemaMovil {
    public static void main(String[] args) {
        Exercici29 inicial = new Exercici29(2.1, 5.2);
        Recta trayectoria = new Recta (2, 1);
        MovUniforme miMov = new MovUniforme(2, 4);
        Movil m = new Movil(inicial, trayectoria, miMov);
        
        System.out.println("Me encuento en " + m.posActual().distancia());
        
        m.avanza(3,2);
        System.out.println("Me encuentro en " + m.posActual().distancia());
        
        m.avanza(4);
        System.out.println("Me encuentro en " + m.posActual().distancia());
        
        m.avanza(6,2);
        System.out.println("Me encuentro en " + m.posActual().distancia());
        
        
    }
}
