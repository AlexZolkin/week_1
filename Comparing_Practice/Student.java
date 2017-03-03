package week_1.Comparing_Practice;

/**
 * Created by Алексей on 03.03.2017.
 */
public class Student implements Comparable<Student>{
    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(this.getClass() != obj.getClass())
            return false;
        Student new_Student = (Student) obj;
        if((new_Student.age != this.age) && (!new_Student.name.equals(this.name)))
            return false;

        return true;
    }
    @Override
    public int compareTo(Student student){
        if (this.age < student.age)
            return -1;
        if (this.age > student.age)
            return 1;
        return 0;
    }
}
