package pkg1erexamen;

import java.util.Arrays;
// Exercici 1

public class Examen {

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
//Exercici 2

    public static void descomposicioFactorial(int n) {
        int[] matriu = cribadeEratostenes(n);
        int contador = 0;
        int resultat = n;
        String prova = "";

        for (int k = 0; matriu[k] <= matriu.length; k++) {
            while (resultat % matriu[k] == 0) {
                System.out.println(matriu[k] + " ");
                int calcul = resultat / matriu[k];
                resultat = calcul;
            }

        }
    }
//Exercici 3

    public static char[] eliminacioText(String t, String p) {
        char[] text = new char[t.length()];
        char[] paraula = new char[p.length()];
        char[] resultat = new char[t.length()];

        for (int i = 0; i < p.length(); i++) {
            paraula[i] = p.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            text[i] = t.charAt(i);
        }

        for (int k = 0; k < text.length; k++) {
            if (text[k] == paraula[0]) {
                for (int i = 1; i < paraula.length; i++) {
                    if (text[k + i] == paraula[0 + i]) {
                        break;
                    } else {
                        resultat[k + i] = text[k + i];
                    }
                }
            } else {
                resultat[k] = text[k];
            }
        }
        return (resultat);
    }

    public static void main(String[] args) {
        int numMax = 120;
        int n = 40;
        String t = "Hola que tal? Hola";
        String p = "Hola";

        System.out.println("La criba de Eratostenes de " + numMax + " es:");
        System.out.println(Arrays.toString(cribadeEratostenes(numMax)));
        System.out.println("La descomposició de " + n + " es:");
        descomposicioFactorial(n);
        System.out.println(" ");
        System.out.println(eliminacioText(t, p));
    }

}
