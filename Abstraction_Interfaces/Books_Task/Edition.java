package week_1.Abstraction_Interfaces.Books_Task;

import java.util.ArrayList;

/**
 * Created by Алексей on 02.03.2017.
 */
public interface Edition {
    ArrayList<Book> books = new ArrayList<Book>();

    void add_Book();
    void add_Book(String name, String author, int year);

    void delete_Book();
    void delete_All_Books(int year);

    String get_Book();
}
