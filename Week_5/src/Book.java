import java.lang.reflect.Array;
import java.util.Arrays;

public class Book extends Source {

    //fields

    private String editie;

    //constructors

    public Book(String titel, Author[] auteurs , int jaartal, String editie ) {
        super(titel, auteurs, jaartal);
        this.editie = editie;
    }

    //getters & setters

    public String getEditie() {
        return editie;
    }

    @Override
    public String toString() {
        return "Book{" +
                "auteurs=" + Arrays.toString(auteurs) +
                '}';
    }
}