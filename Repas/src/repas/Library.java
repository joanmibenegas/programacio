/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repas;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author joanmi
 */
public class Library {
    
    public static Scanner input = new Scanner(System.in);
    
    public static Client[] clients;
    
    public static void main(String[] args) throws Exception {
        System.out.print("Set number of clients: ");
        int numClients = input.nextInt();
        clients = new Client[numClients];
        for (int i = 0;i < numClients;i++) {
            setNewClient();
            System.out.println(Arrays.toString(clients[i].getClient()));
        }
    }
    
    public static void setNewClient() {
        System.out.print("Set name of clients: ");
        String name = input.next();
        System.out.print("Set surnames of clients: ");
        String surname1 = input.next();
        String surname2 = input.next();
        String surnames = surname1 + " " + surname2;
        System.out.print("Set DNI of clients: ");
        int DNI = input.nextInt();
        Client client = new Client(name, surnames, DNI);
        for (int i = 0;i < clients.length;i++) {
            if (clients[i] == null) {
                clients[i] = client;
            }
        }
    }
    
}
