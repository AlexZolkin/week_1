package week_1.Abstraction_Interfaces.Books_Task;

import java.util.ArrayList;

/**
 * Created by Алексей on 02.03.2017.
 */
/*
* Interface
 * contains global book collection
 * and add/delete methods for further implementation
* */
public interface Edition {
    ArrayList<Book> books = new ArrayList<Book>();

    void addBook();
    void addBook(String name, String author, int year);

    void deleteBook();
    void deleteAllBooks(int year);

    String getBook();
}
