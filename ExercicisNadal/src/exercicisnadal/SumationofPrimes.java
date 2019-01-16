package exercicisnadal;




public class SumationofPrimes {
    public static long sumatorioPrimos(int[] array){
        long resultat = 0;
        for(int i = 0; i<array.length; i++){
            resultat += array[i];
        }
        return resultat;        
    }
    public static void main(String[] args) {
      int n = 2000000;
      cribaErastotenes criba = new cribaErastotenes();
      int[] array = criba.cribadeEratostenes(n);
        System.out.println(sumatorioPrimos(array));
    }

}
