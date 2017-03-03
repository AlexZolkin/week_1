package week_1.Abstraction_Interfaces.Doctors_Task;

/**
 * Created by Алексей on 03.03.2017.
 */
/*
* Base class
* implements one method from interface too
* constructor with string parameter for initialising only one property
* */
public class Surgeon implements Doctor {
    protected String alert;
    public Surgeon(String alert) {
        this.alert = alert;
    }
    /*
    * Interface realisation
    * */
    @Override
    public String performOperation() {
        return this.alert;
    }
}
