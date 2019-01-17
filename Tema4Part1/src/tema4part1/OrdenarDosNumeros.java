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
public class OrdenarDosNumeros {
    public void escribeOrdenadorDosNumeros(double a, double b){
        if (a < b) {
            System.out.println(a + " " + b);
        } else  {
            System.out.println(b + " " + a);
        }
    }
}
