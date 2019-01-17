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
public class suma {
    public static int sumaTotal (int ... numeros) {
        int suma = 0;
        for (int num: numeros){
            suma += num;
        }
        return suma;
    }
    }

