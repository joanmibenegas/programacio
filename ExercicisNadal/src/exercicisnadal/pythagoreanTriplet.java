package exercicisnadal;

public class pythagoreanTriplet {
    public static int pitagorasTriple(int n){
        int resultat = 0;
            
            for(int a = 1; a < n; a++){
                for(int b = a+1; b < n; b++){
                    int c = n - a -b;
                    
                    if(c*c==a*a+b*b){
                        
                        resultat = a*b*c;
                        break;
                    }
                        
                }
            }
        
        return resultat;
    }
    public static void main(String[] args) {
      int n = 1000;
        System.out.println(pitagorasTriple(n));
    }

}
