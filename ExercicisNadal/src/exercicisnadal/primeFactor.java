/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisnadal;

import java.util.ArrayList;

/**
 *
 * @author joanmi
 */
public class primeFactor {
    public static void primos(String n){
        long nc = Long.parseLong(n);
        long calc = nc;
        
        ArrayList<Integer> primos=new ArrayList<>();
        
        for(int i = 2; 1 < calc; i++ ){
            if(calc%i==0){
                primos.add(i);
                calc = calc/i;
                i = i-1;
            } 
            
        }
        System.out.println(primos);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        primos("600851475143");
    }
    
}
