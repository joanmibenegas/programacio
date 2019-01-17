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
public class NumerosPerfectos {
    public static boolean calcNum( int x ) {
        int suma = 0;
        
        if ( x < 1){
            return false;
        }
        
        for (int i = 1; i < x; i++){
            if ( x%i == 0){
                suma += i;
            }
        }
        return suma==x;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    if (calcNum(0)){
        System.out.println("Si ho es");
    
    } else {
        System.out.println("No ho es");
    
    }
    
    }
}
