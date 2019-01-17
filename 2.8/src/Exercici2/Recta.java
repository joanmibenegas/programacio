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
public class Recta {
    private double a, b;
    
    Recta(double a, double b){
        this.a = a;
        this.b = b;
    }
    double pendiente(){
        return Math.atan(a);
    }
}
