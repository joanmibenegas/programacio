/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisconjunts3;

import java.util.Arrays;

/**
 *
 * @author joanmi
 */
public class GirarNumeros {

public static int[] ordenarNumeros( int[] matriu){
         
 
 for ( int k = 0; k<matriu.length-1;k++){
    int index = k;
    for ( int i = k+1; i<matriu.length; i++){
        if (matriu[index] < matriu[i]){
            index = i;
        }
        int petit = matriu[index]; 
        matriu[index] = matriu[i];
        matriu[i] = petit;
    }

 }
 return matriu;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] matriu = {5,1,12,-5,16,2,12,14};
        ordenarNumeros(matriu);
        
        System.out.println(Arrays.toString(ordenarNumeros(matriu)));
    }
    
}
