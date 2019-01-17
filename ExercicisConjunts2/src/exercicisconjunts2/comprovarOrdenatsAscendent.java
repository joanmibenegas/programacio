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
public class comprovarOrdenatsAscendent {
    public static boolean comprovarOrden( int[] matriu) {
        for ( int i = matriu.length-1 ; i > 0 ; i--) {
            if(matriu[i] < matriu[i-1]){
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
        int[] matriu = {61,62,63,64};
        boolean resultat = comprovarOrdenatsAscendent.comprovarOrden(matriu);
        System.out.println(resultat);
    }
    
}
