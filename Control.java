import org.omg.CORBA.Environment;
import week_1.Abstraction_Interfaces.Books_Task.*;

import java.io.Console;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by Алексей on 02.03.2017.
 */
public class Control{


    public static void main(String[] args)
    {
        String menu = "1 - new Catalog\n2 - new Encyclopedia\n3 - show library\n0 - Exit";
        Scanner sc = new Scanner(System.in);
        int k;
        do {
            System.out.println(menu);
            k = sc.nextInt();
            switch (k)
            {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    add_Book(Books_Type.Catalog);
                    break;
                case 2:
                    add_Book(Books_Type.Encyclopedia);
                    break;
                case 3:
                    show_Lib();
                    break;
            }
        }while (k != 0);
    }
    private static void add_Book(Books_Type book) {
        switch (book.toString()) {
            case "Catalog":
                new Catalog("Book - C", "Author", 1).add_Book();
                break;
            case "Encyclopedia":
                new Encyclopedia("Book - E", "Author", 1).add_Book();
                break;
        }
    }
    private static void show_Lib(){
        String result = "";
        Iterator<Book> iter = Edition.books.iterator();
        while (iter.hasNext())
        {
            result += iter.next().get_Book();
            result += "\n";
        }
        System.out.println(result);
    }
}

