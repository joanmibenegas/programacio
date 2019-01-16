/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisnadal;

import java.util.Arrays;

/**
 *
 * @author joanmi
 */
public class fibonacci {
    public static int sumaFibonacci(int n){
        int sumaFibonacci = 0;
        int primerNombre = 1;
        int segonNombre = 1;
        int temp = 1;
        
        while(primerNombre<n){
            temp = primerNombre+segonNombre;
            primerNombre = segonNombre;
            segonNombre = temp;
            if(temp%2==0){
                sumaFibonacci+=temp;
            }
        }
        
        
        return sumaFibonacci;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(sumaFibonacci(4000000));     
    }
    
}
