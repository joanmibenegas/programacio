/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisconjunts2;

/**
 *
 * @author joanm
 */
public class valorMaxim {
    public static int calcValorMaxim( int[] matriu) {
        int valormax = matriu[1];
        for (int i = 0; i < matriu.length; i++) {
            if (matriu[i]>valormax){
                valormax = matriu[i];
            }
        }
        return valormax;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] matriu = {64,61,6,66,69};
        int resultat = valorMaxim.calcValorMaxim(matriu);
        System.out.println(resultat);
    }
    
}
