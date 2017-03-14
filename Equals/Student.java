package week_1.Equals;

/**
 * Created by Алексей on 03.03.2017.
 */
/*
* Student representing class
* stands for every person
* name and age used as properties
* constructor initialises properties
* */
public class Student {
    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    /*
    * Overriding one of Object's function
    * needed for accurate comparing two random students
     * for equality
    * */
    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(this.getClass() != obj.getClass())
            return false;
        Student newStudent = (Student) obj;
        if((newStudent.age != this.age) && (!newStudent.name.equals(this.name)))
            return false;

        return true;
    }
}
