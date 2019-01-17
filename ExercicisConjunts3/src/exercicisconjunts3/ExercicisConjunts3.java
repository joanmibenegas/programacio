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
public class ExercicisConjunts3 {

    public static boolean calcNumerosPrimos(int n){
        for ( int k = 2; k < n ; k++){
            if (n % k == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void imprimirXPrimers(int r){
        int p = 1;
        int trobats = 0;
        
        while ( trobats < r ){
            if ( calcNumerosPrimos(p) ){
                trobats++;
                System.out.println(p);
            }
            p++;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
