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
public class mitjaAritmetica {
    public static float mitjaAritmetica ( float[] matriu ) {
        float resultat;
        float sumaNotes = 0;
        
        for( int i = 0; i < matriu.length ; i++){
            sumaNotes = sumaNotes + matriu[i];
        }
        
        resultat = sumaNotes/matriu.length;
        return resultat;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float[] matriu = {10, 8, 2};
        double calcMitja = mitjaAritmetica.mitjaAritmetica(matriu);
        System.out.println(calcMitja);
    }
    
}
