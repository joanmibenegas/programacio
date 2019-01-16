package exercicisnadal;


import exercicisnadal.cribaErastotenes;
import java.util.Arrays;

public class calcPositionPrime {
    public static int calcPosicio(long n){
        cribaErastotenes criba = new cribaErastotenes();
        int[] array = criba.cribadeEratostenes(n);
        
        
        return calcPosicio(array, n);
    }
    public static int calcPosicio(int[] array, long n){
        int resultat = 0;
        
        resultat=array[(int) n-1];
        
        return resultat;
    }
    public static void main(String[] args) {
        System.out.println(calcPosicio(10001));
    }

}
