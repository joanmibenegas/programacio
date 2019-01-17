package library;

/**
 *
 * @author joanmi
 */
public class Book {
    String title;
    String theme;
    Autor autor;
    int ISBN;
    
    public Book(String title, String theme, Autor autor, int ISBN) {
        this.title = title;
        this.theme = theme;
        this.autor = autor;
        this.ISBN = ISBN;
    }
}
