package week_1.Equals;

import java.util.Scanner;

/**
 * Created by Алексей on 03.03.2017.
 */
/*
* main function realisation
* simple menu is used
* adding student with name and age typed
* showing current student list to the user
* */
public class Main {
    public static void main(String[] args){
        University univer = new University();
        Scanner in = new Scanner(System.in);
        String menu = "1-Add Student(name and age)\n2-Show Final List\n3-Exit";

        do {
            System.out.println(menu);
            int k = in.nextInt();
            switch (k){
                case 1:
                    univer.add_Student(new Student(in.next(),in.nextInt()));
                    break;
                case 2:
                    univer.show_List();
                    break;
                case 3:
                    System.exit(0);
            }
        }while (true);
    }
}
