/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4part1;
import java.util.*;
/**
 *
 * @author joanm
 */
public class Ejercici11 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("El programa le pedira el nombre y dos apellidos de dos personas.");
        System.out.print("Introduzca el nombre de la primera persona:");
        String nombre1 = teclado.nextLine();
        System.out.println("Introduzca el primer apellido: ");
        String apellido1Per1 = teclado.nextLine();
        System.out.print("Introduzca el segundo apellido: ");
        String apellido2Per1 = teclado.nextLine();
        
        System.out.print("Introduzca el nombre de la segunda persona: ");
        String nombre2 = teclado.nextLine();
        System.out.print("Introduzca el primer apellido: ");
        String apellido1Per2 = teclado.nextLine();
        System.out.print("Introduzca el segundno apellido: ");
        String apellido2Per2 = teclado.nextLine();
        
        if((apellido1Per1.compareToIgnoreCase (apellido1Per2)<0) || 
                (apellido1Per1.equalsIgnoreCase(apellido1Per2) && 
                    apellido2Per1.compareToIgnoreCase(apellido2Per2)<0) || 
                (apellido1Per1.equalsIgnoreCase(apellido1Per2) && 
                    apellido2Per1.equalsIgnoreCase(apellido2Per2) && 
                    nombre1.compareToIgnoreCase(nombre2) <0)){
                System.out.println(apellido1Per1 + " " + apellido2Per1 + ", " + nombre1);
                System.out.println(apellido1Per2 + " " + apellido2Per2 + ", " + nombre2);
        } else {
            System.out.println(apellido1Per2 + " " + apellido2Per1 + ", " + nombre2);
            System.out.println(apellido1Per1 + " " + apellido2Per1 + ", " + nombre1);
        }
    }
}
