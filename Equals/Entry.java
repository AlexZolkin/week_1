package week_1.Equals;

/**
 * Created by Алексей on 03.03.2017.
 */
/*
* Interface
* Used for adding new students and new groups
* for showing list of students in console
* */
public interface Entry {
    boolean addGroup(Group group);
    boolean addStudent(Student new_Student);

    void showList();
}
