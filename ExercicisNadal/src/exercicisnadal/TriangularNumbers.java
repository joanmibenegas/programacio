package exercicisnadal;


public class TriangularNumbers {
    public static int trobarDivisors(int n){
        //int resultat = 0;
        int i = 1;
        int j = 2;
        //boolean trobat = false;
       // while (!trobat) {
        
            for(;;){
            if ( divisors(i) >= n )
                return i;
            
            i+=j;
            j++; }
            
            /*if (divisors(i) > n) {
                resultat = i;
                trobat = true;
            } else {
                i += j;
                j++;
            }
        }*/
        //return resultat;
    }

    public static int divisors(int n) {
        int resultat = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                resultat+= 2;
            }
        }
        return resultat;
    }

    public static void main(String[] args) {
        int n = 500;
        System.out.println(trobarDivisors(n));
    }

}
