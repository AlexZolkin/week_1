package week_1.Equals;

import week_1.Abstraction_Interfaces.Books_Task.Edition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by Алексей on 03.03.2017.
 */
/*
* used for creating a new university - groups collection
* have groups collection as property
* constructor initialises empty groups collection
* */
public class University implements Entry {
    ArrayList<Group> groups;

    public University(){
        groups = new ArrayList<Group>();
    }
    /*
    * Interface realisation
    * adding new named group into collection
    * checking for names matching
    * */
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
    /*
    * Interface realisation
    * adding new student
    * there can be up to 2 students in group
    * after fulfilling current group, creating new
    * checking for names matching
    * */
    @Override
    public boolean add_Student(Student new_Student){
        Scanner in = new Scanner(System.in);
        if(this.groups.size() != 0){
            if(this.groups.get(this.groups.size() - 1).group.size() > 1){
                System.out.println("Enter Group Name(different to others):");
                add_Group(new Group(in.next()));
                return this.groups.get(this.groups.size() - 1).add_Student(new_Student);
            }
            return this.groups.get(this.groups.size() - 1).add_Student(new_Student);
        }
        System.out.println("Enter Group Name(different to others):");
        add_Group(new Group(in.next()));
        return this.groups.get(this.groups.size() - 1).add_Student(new_Student);
    }
    /*
   * Interface realisation
   * prints group names
   * calling same function, realised in every group
   * */
    @Override
    public void show_List(){
        Iterator<Group> iterator = this.groups.iterator();
        while (iterator.hasNext()){
            Group group = iterator.next();
            System.out.println("\t" + group.group_name);
            group.show_List();
            System.out.println();
        }
    }
}
