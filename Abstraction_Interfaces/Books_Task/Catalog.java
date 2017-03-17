package week_1.Abstraction_Interfaces.Books_Task;

import java.util.Iterator;

/**
 * Created by Алексей on 02.03.2017.
 */
public class Catalog extends Book {
    /*
    * Constructor for Catalog Book type,
    * cause Catalog extends Book class, we have to use super
    * for launching Book constructor, but here BookType is Catalog for
    * all books created with this constructor
    * */
    public Catalog(String name, String author, int year){
        super(name, author, year, BooksType.Catalog);
    }
    /*
    * Edition Interface realisation
    * adding current book to a global collection
    * */
    @Override
    public void addBook(){
        this.name = this.name == null? "No Name: Catalog" : this.name;
        this.year = this.year < 0? 0 : this.year;
        this.author = this.author == null? "No Author" : this.author;

        books.add(this);
    }
    /*
    * Edition Interface realisation
    * creating a new book, but with the same properties
    * and adding it to a global collection
    * */
    @Override
    public void addBook(String name, String author, int year){
        new Catalog(name, author, year).addBook();
    }
    /*
    * Edition Interface realisation
    * deleting current book from global collection
    * */
    @Override
    public void deleteBook(){
        books.remove(this);
    }
    /*
    * Edition Interface realisation
    * deleting all books, created in the same year
    * */
    @Override
    public  void deleteAllBooks(int year){
        Iterator<Book> iter = books.iterator();

        while (iter.hasNext()) {
            Book tmp = iter.next();
            if(tmp.bookType == bookType && tmp.year == year)
                books.remove(tmp);
        }
    }
    /*
    * Edition Interface realisation
    * getter for current book
    * returns one formatted string with name and author
    * */
    @Override
    public String getBook()
    {
        return this.name + " - " + this.author;
    }
}
