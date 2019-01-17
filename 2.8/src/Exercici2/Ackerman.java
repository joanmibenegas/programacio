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
public class Ackerman {
    public static int Ackerman (int m, int n) throws Exception {
      if (n<0 || m<0){
          throw new Exception ("Parámetros no validos.");
      }
      if (m == 0) {
          return n+1;
      }
      
      if ( n == 0 ) {
          return Ackerman (m-1,1);
      }
      return Ackerman (m - 1, Ackerman (m,n - 1));
     
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Ackerman(0,0)="+Ackerman(0,0));
        System.out.println("Ackerman(2,2)="+Ackerman(2,2));
        System.out.println("Ackerman(3,3)="+Ackerman(3,3));
        System.out.println("Ackerman(6,6)="+Ackerman(6,6));
    }
}
