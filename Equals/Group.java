package week_1.Equals;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Алексей on 03.03.2017.
 */
/*
* Collects students in named groups
* have name and students collection as properties
* */
public class Group extends University {
    String groupName;
    ArrayList<Student> group;
    /*
    * constructor
    * creates new empty, named group
    * */
    public Group(String groupName) {
        group = new ArrayList<Student>();
        this.groupName = groupName;
    }
    /*
    * Interface realisation
    * adds new student into current group
    * checks, if there is the same student had been added already
    * */
    @Override
    public boolean addStudent(Student newStudent){
        Iterator<Student> iterator = this.group.iterator();

        while (iterator.hasNext()) {
            if(iterator.next().equals(newStudent))
                return false;
        }
        this.group.add(newStudent);
        return true;
    }
    /*
    * Basic function overriding
    * accurate test for
    * equality with current group
    * is used for not dding groups with the same names
    * */
    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(this.getClass() != obj.getClass())
            return false;
        Group newGroup = (Group) obj;
        if(!(((Group) obj).groupName.equals(this.groupName)))
            return false;

        return true;
    }
    /*
    * Interface realisation
    * prints student list in console
    * if empty, prints Empty
    * */
    @Override
    public void showList(){
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
