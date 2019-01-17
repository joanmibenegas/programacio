/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercici2;

/**
 *
 * @author joanm
 */
public class trayectoriaTest {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Exercici29 p1 = new Exercici29(0,0);
        Exercici29 p2 = new Exercici29(2,4);
        Exercici29 p3 = new Exercici29(4,5);
        Exercici29 p4 = new Exercici29(4,6);
        Exercici29 p5 = new Exercici29(3,4);
        Trayectoria num =new Trayectoria();

        System.out.println("Se ha recorrido " + num.calcTrayectoria(p1,p2,p3,p4,p5,p1));
        System.out.println("Se ha recorrido " + num.calcTrayectoria(p1));
        System.out.println("Se ha recorrido " + num.calcTrayectoria());

       
    }
    
}
