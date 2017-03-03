package week_1.Equals;

import week_1.Abstraction_Interfaces.Books_Task.Edition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by Алексей on 03.03.2017.
 */
public class University implements Entry {
    ArrayList<Group> groups;

    public University(){
        groups = new ArrayList<Group>();
    }

    @Override
    public boolean add_Group(Group group){
        Iterator<Group> iterator = this.groups.iterator();
        while (iterator.hasNext()){
            if(iterator.next().equals(group))
                return false;
        }
        this.groups.add(group);
        return true;
    }

    @Override
    public boolean add_Student(Student new_Student){
        Scanner in = new Scanner(System.in);
        if(this.groups.get(this.groups.size() - 1).group.size() > 5)
            return add_Group(new Group(in.nextLine()));
        return this.groups.get(this.groups.size() - 1).add_Student(new_Student);

    }
}
