package Ikinci_Ay.AbstractionPractiseApp;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "X7", 2020);
        MotorCycle motorCycle = new MotorCycle("Yamaha", "MT-07", 2021);
        car.displayInfo();
        car.startEngine();
        System.out.println();
        motorCycle.displayInfo();
        motorCycle.startEngine();

    }
}
