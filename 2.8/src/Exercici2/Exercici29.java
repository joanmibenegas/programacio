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
public class Exercici29 {
    private double x, y;
 //CONSTRUCTORS
    public Exercici29(double x, double y) {
        this.x = x;
        this.y = y;
    }
   // EXERCICI 2.10 
    public Exercici29() {
        this.x = 0;
        this.y = 0;
    }
    
    public double displayX() {
        return x;
    }
    public double displayY() {
        return y;
    }
    //Metode distancia (amb una excepcio)
    public double distancia (Exercici29 p) throws Exception {
        if (p == null) 
            throw new Exception("p No puede ser null");
        
        double diffX = x - p.x;
        double diffY = y - p.y;
        
        return Math.sqrt (Math.pow (diffX, 2) + Math.pow (diffY, 2));
        
    }
    public double distancia () {
        return Math.sqrt (x*x+y*y);
        
    }
    
}
