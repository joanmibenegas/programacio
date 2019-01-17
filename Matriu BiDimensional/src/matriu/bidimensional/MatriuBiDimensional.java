/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriu.bidimensional;

import java.util.Arrays;

/**
 *
 * @author joanmi
 */
public class MatriuBiDimensional {

    public static int[][] tauler(int f, int c){
        int[][] tauler = new int[f][c];
        
        for (int i = 0; i<tauler.length;i++){
            System.out.println("");
            for (int k = c-1; k >= 0 ;k--){
                int calcul = tauler[i][k] = k + i * tauler[0].length;
                if (tauler[i][k]<10){
                    System.out.print("0"+ calcul + "  ");
                } else {
                    System.out.print(calcul + "  ");
                }
                
                // ( (String) r ).length == 1 ? 
            }
        }
        return tauler;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int f = 8;
        int c = 8;
        
        tauler(f,c);
    }
    
}
