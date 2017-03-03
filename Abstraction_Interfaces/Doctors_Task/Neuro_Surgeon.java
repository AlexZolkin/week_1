package week_1.Abstraction_Interfaces.Doctors_Task;

/**
 * Created by Алексей on 03.03.2017.
 */
/*
* Surgeon child class
* uses super for initialising property if base class
* */
public class Neuro_Surgeon extends Surgeon{
    public Neuro_Surgeon(String alert){
        super(alert);
    }
    /*
     * simply returns string message for showing in console
     * Interface realisation
     */
    @Override
    public String performOperation(){
        return this.alert;
    }
}
