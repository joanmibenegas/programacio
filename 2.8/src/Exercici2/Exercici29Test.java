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
public class Exercici29Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        //Objectes
        Exercici29 myCoord1 = new Exercici29(0,0);
        Exercici29 myCoord2 = new Exercici29(5,3);
        Exercici29 myCoord3 = new Exercici29(2,-1);
        Exercici29 myCoord4;
        Exercici29 myCoord5 = null;
        //CALCUL MITJANA
        double MediaX = (myCoord2.displayX()+myCoord3.displayX())/2;
        double MediaY = (myCoord2.displayY()+myCoord3.displayY())/2;
        
        
        myCoord4 = new Exercici29(MediaX,MediaY);
        //PRINTS
        System.out.println("Coordenada 1: ("+myCoord1.displayX()+","+myCoord1.displayY()+")");
        System.out.println("Coordenada 2: ("+myCoord2.displayX()+","+myCoord2.displayY()+")");
        System.out.println("Coordenada 3: ("+myCoord3.displayX()+","+myCoord3.displayY()+")");
        System.out.println("Coordenada 4: ("+myCoord4.displayX()+","+myCoord4.displayY()+")");
        System.out.println("Calcul: "+myCoord3.distancia(myCoord4));
    //EXERCICI 2.13 (NO S'HAVIA DE FER)
        Exercici29 porigen = new Exercici29(0,0);
        Exercici29 point = new Exercici29(4,3);
        System.out.println("Calcul origen: "+point.distancia(porigen));
    }
}

