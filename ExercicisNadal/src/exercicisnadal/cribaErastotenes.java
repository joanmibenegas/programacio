package exercicisnadal;


import java.util.Arrays;

public class cribaErastotenes {

    public static int[] cribadeEratostenes(int numMax) {
        boolean[] primers = new boolean[numMax + 1];
        int contador = 0;
        int[] resultat = null;
        int q = 0;

        for (int i = 0; i < numMax; i++) {
            primers[i] = true;
        }

        for (int k = 2; k <= numMax; k++) {
            if (primers[k] == true) {
                for (int z = k * 2; z <= numMax; z += k) {
                    primers[z] = false;
                }
            }
        }

        for (int a = 2; a <= numMax; a++) {
            if (primers[a] == true) {
                contador++;
            }
        }
        resultat = new int[contador];

        for (int s = 2; s <= numMax; s++) {

            if (primers[s] == true) {
                resultat[q] = s;
                q++;
            }
        }
        return resultat;
    }

    public static int[] cribadeEratostenes(long n) {
        int numMax = (int) n;
        int limit = numMax * 100000;
        boolean[] primers = new boolean[numMax * 100001];
        int contador = 0;
        int[] resultat = null;
        int q = 0;
        int range = 0;
        System.out.println(primers.length);
        for (int i = 0; i < limit; i++) {
            primers[i] = true;
        }

        for (int k = 2; k <= limit; k++) {
            if (primers[k] == true) {
                for (int z = k * 2; z <= limit; z += k) {
                    primers[z] = false;
                }
            }

        }

        for (int a = 2; a <= limit; a++) {
            if (contador == numMax + 5) {
                break;
            } else {
                if (primers[a] == true) {
                    contador++;
                }
            }

        }
        resultat = new int[contador];
        
        for (int s = 2; s <= limit; s++) {
            if (range == numMax + 5) {
               break; 
            } else {
                if (primers[s] == true) {
                    range++;
                    resultat[q] = s;
                    q++;
                }
            }
        }
        return resultat;
    }

}
