package Ikinci_Ay.AbstractionPractiseApp;

public abstract class Vehicle {
    String brand;
    String model;
    int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public abstract void startEngine();

    public void displayInfo() {
        System.out.println("The vehicle engine is starting");
    }

}

