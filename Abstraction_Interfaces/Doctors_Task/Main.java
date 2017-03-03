package week_1.Abstraction_Interfaces.Doctors_Task;

/**
 * Created by Алексей on 03.03.2017.
 */
/*
* Main function realisation
* simply creates both object types, shows their types through custom
* function in console
* */
public class Main {
    public static void main(String[]args){
        System.out.println(new Neuro_Surgeon("I'm NeuroSurgeon").performOperation());
        System.out.println(new Surgeon("And i'm Surgeon").performOperation());
    }
}
