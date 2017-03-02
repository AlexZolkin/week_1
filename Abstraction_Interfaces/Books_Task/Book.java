package week_1.Abstraction_Interfaces.Books_Task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Алексей on 02.03.2017.
 */
public abstract class Book implements Edition{
    protected String name, author;
    protected  int year;
    protected Books_Type book_Type;

    public Book(String name, String author, int year, Books_Type book_Type){
        this.name = name.isEmpty() ? "No Name" : name;
        this.author = author.isEmpty() ? "No Author" : author;
        this.year = year <= 0 ? 0 : year;
        this.book_Type = book_Type == null ? Books_Type.Undefined : book_Type;
    }

    @Override
    public void add_Book(){

    }
    @Override
    public void add_Book(String name, String author, int year){

    }

    @Override
    public void delete_Book(){

    }
    @Override
    public void delete_All_Books(int year){

    }

}
