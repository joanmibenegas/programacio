/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repas;

import java.lang.Exception;

/**
 *
 * @author joanmi
 */
public class Client {
    
    private String name, surname1, surname2;
    private int DNI;
    
    public Client(String nom, String surnames, int DNI) {
        this.name = nom;
        this.DNI = DNI;
        setFirstSurname(surnames);
    }
    
    private void setFirstSurname(String surnames) {
        String[] surname;
        surname = surnames.split(" ");
        this.surname1 = surname[0];
        setSecondSurname(surname[1]);
    }
    
    private void setSecondSurname(String surname2) {
        this.surname2 = surname2;  
    }
    
    public String[] getClient() {
        String[] client = new String[4];
        client[0] = name;
        client[1] = surname1;
        client[2] = surname2;
        client[3] = "" + DNI;
        return client;
    }
    
    public String getClientDetail(String info) throws Exception {
        String[] client = this.getClient();
        switch (info) {
            case "name":
                return client[0];
            case "firstSurname":
                return client[1];
            case "secondSurname":
                return client[2];
            case "DNI":
                return client[3];
            default:
                throw new Exception("Wrong or none parameter entered");
        }
    }
}