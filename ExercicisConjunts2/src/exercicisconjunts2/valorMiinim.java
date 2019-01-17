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
public class valorMiinim {
    public static int calcValorMin( int[] matriu ) {
        int valormin = matriu[0];
        
        for( int i= 0; i < matriu.length; i++)
            if (matriu[i]<valormin){
                valormin = matriu[i];
            }
        return valormin;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] matriu = {64,61,6,66,69};
        int resultat = valorMiinim.calcValorMin(matriu);
        System.out.println(resultat);
    }
    
}
