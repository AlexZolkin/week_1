package week_1.Abstraction_Interfaces.Books_Task;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Алексей on 02.03.2017.
 */
public class Catalog extends Book {

    public Catalog(String name, String author, int year){
        super(name, author, year, Books_Type.Catalog);
    }

    @Override
    public void add_Book(){
        books.add(this);
    }
    @Override
    public void add_Book(String name, String author, int year){
        books.add(new Catalog(this.name, this.author, this.year));
    }

    @Override
    public void delete_Book(){
        books.remove(this);
    }
    @Override
    public  void delete_All_Books(int year){
        Iterator<Book> iter = books.iterator();

        while (iter.hasNext()) {
            if(iter.next().book_Type == book_Type && iter.next().year == year)
                books.remove(iter.next());
        }
    }
    @Override
    public String get_Book()
    {
        return this.name + " - " + this.author;
    }
}
