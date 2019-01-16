package exercicisnadal;


public class multiploPequeñoLog {

    public static int calcMultiplo(int n) {
        cribaErastotenes criba = new cribaErastotenes();
        int[] array = criba.cribadeEratostenes(n);
        
        return calcMultiplo(array, n);

    }

    public static int calcMultiplo(int[] array, int n) {
        int resultat = 1;
        int exponent = 0;

        for (int i = 0; i < array.length; i++) {
            exponent = (int) (Math.log(n) / Math.log(array[i]));
            resultat *= (int) Math.pow(array[i], exponent);
            
        }
        return resultat;
    }

    public static void main(String[] args) {
        int n = 20;
        

        cribaErastotenes criba = new cribaErastotenes();
        int[] array = criba.cribadeEratostenes(n);

        int result = calcMultiplo(array, n);

        System.out.println(result);
        
        result = calcMultiplo(n);

        System.out.println(result);
    }

}
