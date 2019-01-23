package exercicisnadal;

public class LatticePaths {

    public static long findPaths(int n ){
        long resultat = 1;
        
        for(int i = 1; i <= n; i++){
            
            resultat = resultat*(n+i)/i;
            
        }
        return resultat;
    }

    public static void main(String[] args) {
        int n = 20;

        System.out.println(findPaths(n));
    }

}
