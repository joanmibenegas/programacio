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
public class multiplos3i5 {
    public static int multiplos(int n, int m1,int m2){
        
        boolean[] numeros = new boolean[n];
        int contador = 0;
        int[] multiplos;
        int q = 0;
        for (int f = 0; f < numeros.length; f++){
            numeros[f] = false;
        }
        
        for(int i = 0; i < numeros.length; i++){
            if(i%m1==0 || i%m2==0){
                numeros[i] = true;
            }
        }
        //Dubte professor
        for(int o = 0; o < numeros.length; o++){
            if(numeros[o]){
              contador++;
            }
        }
        multiplos = new int[contador]; 
        
        for(int m = 0; m < numeros.length; m++){
            if(numeros[m]==true){
            multiplos[q] = m;
            q++;
            }
        }
        
        return sumaMultiplos(multiplos);
    }
    
    public static int sumaMultiplos(int[] m){
        int suma = 0;
        
        for(int i = 0; i<m.length; i++){
            suma += m[i];
        }
        return suma;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(multiplos(1000,3,5));
    }
    
}
