package week_1.Abstraction_Interfaces.Books_Task;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Алексей on 02.03.2017.
 */
public class Catalog extends Book {
    /*
    * Constructor for Catalog Book type,
    * cause Catalog extends Book class, we have to use super
    * for launching Book constructor, but here Book_Type is Catalog for
    * all books created with this constructor
    * */
    public Catalog(String name, String author, int year){
        super(name, author, year, Books_Type.Catalog);
    }
    /*
    * Edition Interface realisation
    * adding current book to a global collection
    * */
    @Override
    public void add_Book(){
        books.add(this);
    }
    /*
    * Edition Interface realisation
    * creating a new book, but with the same properties
    * and adding it to a global collection
    * */
    @Override
    public void add_Book(String name, String author, int year){
        books.add(new Catalog(this.name, this.author, this.year));
    }
    /*
    * Edition Interface realisation
    * deleting current book from global collection
    * */
    @Override
    public void delete_Book(){
        books.remove(this);
    }
    /*
    * Edition Interface realisation
    * deleting all books, created in the same year
    * */
    @Override
    public  void delete_All_Books(int year){
        Iterator<Book> iter = books.iterator();

        while (iter.hasNext()) {
            if(iter.next().book_Type == book_Type && iter.next().year == year)
                books.remove(iter.next());
        }
    }
    /*
    * Edition Interface realisation
    * getter for current book
    * returns one formatted string with name and author
    * */
    @Override
    public String get_Book()
    {
        return this.name + " - " + this.author;
    }
}
