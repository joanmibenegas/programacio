/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4part1;

/**
 *
 * @author joanm
 */
public class TestParesImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ParesImpares myParesImpares = new ParesImpares();
        boolean check = myParesImpares.checkNumeros (3);
        
        if (check == true) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
    
}
