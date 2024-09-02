package Ikinci_Ay.AbstractionPractiseApp;

public class Car extends Vehicle {

    public Car(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void startEngine() {
        System.out.println("The car engine is starting");
    }

    @Override
    public void displayInfo() {
        System.out.println("Brand: " + brand + "\nModel: " + model + "\nYear: " + year);
    }

}
