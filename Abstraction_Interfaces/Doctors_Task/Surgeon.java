package week_1.Abstraction_Interfaces.Doctors_Task;

/**
 * Created by Алексей on 03.03.2017.
 */
public class Surgeon implements Doctor {
    protected String alert;
    public Surgeon(String alert) {
        this.alert = alert;
    }

    @Override
    public String performOperation() {
        return this.alert;
    }
}
