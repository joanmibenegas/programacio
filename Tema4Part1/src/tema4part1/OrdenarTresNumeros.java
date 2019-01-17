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
public class OrdenarTresNumeros {
    public void escribeOrdenarTresNumeros(double a, double b, double c) {
        if ((a < b && a < c)){
            if (b<c){
            System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if  ((b < a  && b < c) && c < b){
            if (a<c) {
               System.out.println(b + " " + a + " " + c); 
            } else {
                System.out.println(b + " " + c + " " + a);
            }
       } else {
            if (a<b) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }       
    }
}

