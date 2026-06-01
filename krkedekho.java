
class Animal{
    void makeSound(){
        System.out.println("Making Sound");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}
    
    public class krkedekho {
    public static void main(String[] args) {
        // final int i;
        // i=20;
        // // i=30;
        // System.out.println(i);

        // Animal a = new Animal();
        // a.makeSound();
        // a.bark();

        // Dog d = new Dog();
        // d.makeSound();
        // d.bark();

        Animal a = new Dog();
        Dog d = (Dog)a;
        a.makeSound();
        d.bark();

        // Dog d = new Animal();
        // Dog d = (Dog)a;
        // d.makeSound();
        // d.bark();

    }
}
