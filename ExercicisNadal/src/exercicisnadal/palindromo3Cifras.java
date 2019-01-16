/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisnadal;

/**
 *
 * @author joanmi
 */
public class palindromo3Cifras {
    //Buscar el palindromo mas grande de 3 cifras.
    public static void palindromo3Cifras(){ 
     int valor1 = 0; 
     int resultat;
     
     for (int i = 999; i > 100; i--) { 
      for (int j = i; j > 100; j--) { 
       resultat = i * j; 
       if (comprovarNumero(resultat) && valor1 < resultat) { 
        valor1 = resultat;
        break;
       } 
      } 
     } 
     System.out.println(valor1); 
    } 

    public static boolean comprovarNumero(int resultat) { 
     int r = resultat; 
     int girar = 0; 
     while (r != 0) {
      girar *= 10; /*Suma un 0 al girar per poder sumarli el següent nombre de 
      la expresió r%10*/
      girar += r % 10; //ens extreu l'ultim nombre
      r /= 10; //li resta l'ultim nombre
     } 
     return girar == resultat; 
    } 
    
    public static void main(String[] args) {
        // TODO code application logic here
        palindromo3Cifras();
    }
    
}
