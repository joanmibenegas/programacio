package library;

import java.util.ArrayList;

/**
 *
 * @author joanmi
 */
public class Autor {

    static ArrayList<Autor> autors = new ArrayList<>();
    
    int DNI;
    String name;
    String surname;
    
    public Autor(int DNI, String name, String surname) {
        this.DNI = DNI;
        this.name = name;
        this.surname = surname;
    }
    
    public void storeAutor() {
        autors.add(this);
    }
    
    public void removeAutor() {
        autors.remove(this);
    }
    
    public static Autor getAutor(String autorName) {
        for (Autor autor: autors) {
            if (autor.name.equals(autorName)) {
                return autor;
            }
        }
        System.out.println("NON FOUND");
        return null;
    }
    
    public ArrayList<Book> getAutorBooks(Autor autor) {
        return null;
    }
}
