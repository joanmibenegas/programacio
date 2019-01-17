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
public class mediaAritmetica {
    public static double mediaAritmetica(double ... numeros){
        double suma = 0;
        for (double num: numeros){
            suma += num;
            
        }
        return suma/numeros.length;
        
    }
}
