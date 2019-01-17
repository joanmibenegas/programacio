/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4part1;

/**
 *
 * @author joanm
 */
public class ParesImpares {
   public boolean checkNumeros(int e) {
       int calc = e%2;
       if ( calc == 0) {
           return true;
       } 
       return false;
   } 
}
