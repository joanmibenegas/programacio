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
public class multiploPequeño {
    public static int numeroPequeño(int n){
        
        int[] contador = new int[n+1];
        int resultat = 0;
        boolean flag = true;
        
        for(int a = n; a > 0; a--){
            int temp = a;
            int[] temporal = new int[n];
            for(int i = 2; 1 < temp ; i++ ){
                if(temp%i==0){
                    temporal[i]++;
                    temp /= i;
                    i-=1;;
                } 
                for(int r = 0; r < temporal.length; r++){
                    if(temporal[r]>contador[r]){
                        contador[r] = temporal[r];
                    }
                }
            }
        }
        
        for(int s = 0; s < contador.length; s++){
            if(flag){
                int calcul = (int) Math.pow(s,contador[s]); 
                resultat += calcul;
                flag = false;
            }else{
                int calcul = (int) Math.pow(s,contador[s]); 
                resultat *= calcul;
            }
        }

        return resultat;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(numeroPequeño(20));
    }
    
}
