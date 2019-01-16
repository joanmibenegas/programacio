package exercicisnadal;

public class diferenciaSumaPotencies {
//Math.pow(numero,potencia)
    public static int calculSumaPotencies(int n){
        int resultat = 0;
        int resultatindividual = 0;
        int resultatsuma = 0;
        int sumatemp = 0;
        boolean flag = true;
        
        //Calcul suma potencies individual
        for(int i = 1; i<=n ; i++){
            int calctemp = (int) Math.pow(i,2);
            resultatindividual += calctemp;
        }
        
        //Calcul suma potencies grupal
        for(int a = 1; a < n+3;a++){
            if(flag){
                if(a<n+1){
                    sumatemp += a;
                } else {
                    flag = false;
                }
                System.out.println(sumatemp);
            } else {
                resultatsuma = (int) Math.pow(sumatemp, 2);
            }
        }
        System.out.println(resultatsuma);
        resultat = resultatsuma-resultatindividual;
        
        return resultat;
    }
    
    public static void main(String[] args) {
        System.out.println(calculSumaPotencies(100));;
    }

}
