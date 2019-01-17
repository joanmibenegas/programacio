package library;

/**
 *
 * @author joanmi
 */

public class Library {
    
    /*public static void main(String[] args) {
        autorCreation();
        bookCreation();
    }*/

    private static void autorCreation() {
        Autor autor;
        for (int i = 0; i < 5; i++) {
            autor = new Autor(i + 1, "Joan" + i, "Tolo" + i);
            autor.storeAutor();
        }
    }

    private static void bookCreation() {
        Book book;
        for (int i = 0; i < 5; i++) {
            book = new Book("Su puta madre.com" + i, "Sus muertos" + i, Autor.getAutor("Joan1"), i);
        }
    }
    
}
