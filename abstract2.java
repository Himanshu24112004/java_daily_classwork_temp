abstract class Animal {
    // Abstract method (does not have a body)
    abstract void sound();

    // Non-abstract method
    void sleep() {
        System.out.println("I am sleeping.");
    }
}

class Dog extends Animal {
    // Providing implementation for the abstract method
    void sound() {
        System.out.println("Dog barks.");
    }
}

public class abstract2 {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.sound();
    }
}
