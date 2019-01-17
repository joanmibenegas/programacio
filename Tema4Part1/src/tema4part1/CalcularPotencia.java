/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4part1;
import java.util.*;
/**
 *
 * @author joanm
 */
public class CalcularPotencia {
    public static void main(String[] args) {
       System.out.println("Quin és el numero real?: ");
       Scanner teclado = new Scanner(System.in);
       int numeroreal = teclado.nextInt();
       System.out.println("Exponent: ");
       int exponent = teclado.nextInt();
       
       int resultat = numeroreal;   
       if (numeroreal == 0)  {
        /*for(int i = 0; i < exponent; i++){
             resultat = resultat * numeroreal;
        }*/
       }
    }
     //System.out.println("El calcul de la potencia "+numeroreal+"^"+exponent+ "=" );
}
