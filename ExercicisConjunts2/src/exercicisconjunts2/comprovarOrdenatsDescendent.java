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
public class comprovarOrdenatsDescendent {
    public static boolean comprovarOrdre( int[] matriu ) {
        for ( int i = matriu.length -1; i > 0 ; i--) {
            if (matriu[i] > matriu[i-1]) {
                return false;               
                
            }
        }
        return true;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] matriu = {69,67,66,61};
        boolean resultat = comprovarOrdenatsDescendent.comprovarOrdre(matriu);
        System.out.println(resultat);
    }
    
}
