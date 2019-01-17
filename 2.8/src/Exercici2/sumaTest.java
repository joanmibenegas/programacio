/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercici2;

/**
 *
 * @author joanm
 */
public class sumaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        int x;
        
        x= suma.sumaTotal (3, 5, 2, 4, 6);
        System.out.println("Primera suma = " + x);
        
        x= suma.sumaTotal (2, 10, -1, 2);
        System.out.println("Segunda suma = " + x);
        
        x= suma.sumaTotal (10);
        System.out.println("Segunda suma = " + x);
        
        x= suma.sumaTotal ();
        System.out.println("Segunda suma = " + x);
    }
    
}
