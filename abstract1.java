abstract class Vehicle{
    // Abstract method (does not have a body)
    abstract void start();

    // Non-abstract method
    void seatingPlace() {
        System.out.println("I have seating places.");
    }
}


class Car extends Vehicle {
    // Providing implementation for the abstract method
    void start() {
        System.out.println("Car start with key.");
    }
}

class Scooter extends Vehicle {
    // Providing implementation for the abstract method
    void start() {
        System.out.println("Scooter start with kick.");
    }
}

public class abstract1 {
    public static void main(String[] args) {

        // Abstract class cannot be instantiated and abstract methods don't have a body.
        // Abstract class can have abstract and non-abstract methods/concrete methods.
        // Abstract class can have constructors and static methods
        // Abstract class can have member variables
        // We cannot create an object of abstract class, but we can create a reference of abstract class that refers to an object of a subclass that extends the abstract class and provides implementation for the abstract methods.
        // If a classhas atleast one abstract method, then the class must be declared as abstract.
        // Abstract method is a method  without a body  

        // Example of abstract class
        // We cannot create an object of abstract class
        // We can create a subclass that extends the abstract class and provide implementation for the abstract methods

        // Abstract class
        Vehicle c = new Car();
        Vehicle s = new Scooter();
        c.start();
        s.start();
    }
}
