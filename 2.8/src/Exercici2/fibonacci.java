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
public class fibonacci {
    public int fibR(int i) throws Exception {
        if (i<0){
            throw new Exception ("Indice negativo");
        }
        if ( i == 0 || i==1){
            return 1;
        } else {
            return fibR(i-1)+fibR(1-2);
        }
    }
}
