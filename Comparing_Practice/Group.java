package week_1.Comparing_Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by Алексей on 03.03.2017.
 */
public class Group extends University {
    String group_name;
    ArrayList<Student> group;

    public Group(String group_name) {
        group = new ArrayList<Student>();
        this.group_name = group_name;
    }

    @Override
    public boolean add_Student(Student new_Student){
        Iterator<Student> iterator = this.group.iterator();

        while (iterator.hasNext()) {
            if(iterator.next().equals(new_Student))
                return false;
        }
        this.group.add(new_Student);
        return true;
    }
    @Override
    public void sort_By_Age(){
        Collections.sort(group);
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(this.getClass() != obj.getClass())
            return false;
        Group new_Group = (Group) obj;
        if(!(((Group) obj).group_name.equals(this.group_name)))
            return false;

        return true;
    }
    @Override
    public void show_List(){
        Iterator<Student> iter = this.group.iterator();
        if(!iter.hasNext()) {
            System.out.println("Empty");
            return;
        }
        while (iter.hasNext()){
            Student student = iter.next();
            System.out.println(student.name + " : " + student.age);
        }
    }
}
