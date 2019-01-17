/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisconjunts3;

/**
 *
 * @author joanmi
 */
public class CribaEratostenes {

        public static void cribadeEratostenes(int numMax){
        boolean[] primers = new boolean[numMax+1];
        
        for(int i = 0;i < numMax;i++){
            primers[i] = true;
        }
        
        for(int k = 2; k <= numMax; k++){
            if(primers[k] == true){
                for(int z = k*2; z <= numMax; z+=k){
                    primers[z] = false;
                }
            }
        }
        
        for(int a = 2; a <= numMax; a++){
            if(primers[a] == true)
                System.out.print(a + " ");
        }
    }
    public static void main(String[] args) {
        int numMax = 120;
        cribadeEratostenes(numMax);
    }
}