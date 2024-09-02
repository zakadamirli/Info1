package Ikinci_Ay.AbstractionPractiseApp;

public class MotorCycle extends Vehicle {

    public MotorCycle(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void startEngine() {
        System.out.println("The motorcycle engine is starting");
    }

    @Override
    public void displayInfo() {
        System.out.println("Brand: " + brand + "\nModel: " + model + "\nYear: " + year);
    }
}
