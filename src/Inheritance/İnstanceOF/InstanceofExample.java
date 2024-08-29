package Inheritance.İnstanceOF;

class Animal {
    void makeSound() {
        System.out.println("Some sound...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }

    void fetch() {
        System.out.println("Fetching...");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

public class InstanceofExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        if (myDog instanceof Dog) {
            Dog dog = (Dog) myDog;
            dog.fetch();
        }

        if (myCat instanceof Cat) {
            Cat cat = (Cat) myCat;
            cat.makeSound(); // Calls the Cat-specific method
        }

        if (myDog instanceof Animal) {
            System.out.println("myDog is an instance of Animal");
        }

        if (myCat instanceof Dog) {
            System.out.println("myCat is an instance of Dog");
        } else {
            System.out.println("myCat is not an instance of Dog");
        }
    }
}

