package week_1.Abstraction_Interfaces.Doctors_Task;

/**
 * Created by Алексей on 03.03.2017.
 */
public class Neuro_Surgeon extends Surgeon{
    public Neuro_Surgeon(String alert){
        super(alert);
    }

    @Override
    public String performOperation(){
        return this.alert;
    }
}