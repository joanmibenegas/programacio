/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercici2;

import javax.swing.JOptionPane;

/**
 *
 * @author joanm
 */
public class relojTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        reloj hora1 = new reloj(2,56,12);
       
        
        int ampm = Integer.parseInt(JOptionPane.showInputDialog("Com vols introduïr l'hora? \n1- 24 Hores \n2- AM \n3- PM"));
       
        if (ampm == 3) {
            System.out.println("La hora amb format 24 hores és: "+hora1.horas+":"+hora1.minutos+":"+hora1.segundos);
            System.out.println("La hora amb format 12 hores és: "+hora1.format24());
        } else if (ampm == 2) {
            System.out.println("La hora amb format 24 hores és: "+hora1.horas+":"+hora1.minutos+":"+hora1.segundos);
            System.out.println("La hora amb format 12 hores és: "+hora1.format24());
        } else if (ampm == 1) {
            System.out.println("La hora amb format 24 hores és: "+hora1.horas+":"+hora1.minutos+":"+hora1.segundos);
            System.out.println("La hora amb format 12 hores és: "+hora1.format24());
        }
    }
    
}
