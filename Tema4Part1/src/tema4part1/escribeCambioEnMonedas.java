/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4part1;

/**
 *
 * @author joanm
 */
public class escribeCambioEnMonedas {
    public void escribeCambioMonedas(double cambio) {
        int devolucion = (int)(cambio*100); //Cambio en centims
        
        if (devolucion >= 200) {
            System.out.println("Moneda 2 euros: "+devolucion/200);
            devolucion %= 200;
        } else if(devolucion >= 100) {
            System.out.println("Moneda 1 euro: "+devolucion/100);
            devolucion %= 100;
         } else if(devolucion >= 50) {
            System.out.println("Moneda 50 centims: "+devolucion/50);
            devolucion %= 50;
        } else if(devolucion >= 20) {
            System.out.println("Moneda 20 centims: "+devolucion/20);
            devolucion %= 20;
         } else if(devolucion >= 10) {
            System.out.println("Moneda 10 centims: "+devolucion/10);
            devolucion %= 10;
         } else if(devolucion >= 5) {
            System.out.println("Moneda 5 centims: "+devolucion/5);
            devolucion %= 5;
         } else if(devolucion >= 2) {
            System.out.println("Moneda 2 centims: "+devolucion/2);
            devolucion %= 2;
         } else if(devolucion >= 1) {
             System.out.println("Moneda 1 centims: "+devolucion/1);
             devolucion %= 1;
         }
    }
}
