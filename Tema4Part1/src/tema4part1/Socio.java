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
public class Socio {
    public static void main(String[] args){
        final int CUOTA = 500;
        final int menor18 = 25;
        final int padre = 35;
        final int mayores = 50;
        
        int edad, cuota;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca la edad del nuevo socio:");
        edad = teclado.nextInt();
        
        cuota = CUOTA;
        
        if(edad >= 65) {
            cuota -= CUOTA * mayores/100;
        } else if (edad < 18) {
            System.out.println("¿Sus padres son socios? (Si/No)");
            String respuesta = teclado.next();
            if (respuesta.equalsIgnoreCase("Si")){
                cuota -= CUOTA * padre/100;                
            } else {
                cuota -= CUOTA * menor18/100;
            }
        }
        System.out.println("Debe pagar de cuota " + cuota + " Euros.");
    }
}
