interface Animal {
    void sound();
    int a =10;    
}

class Dog implements Animal{
    public void sound(){
        System.out.println("barks!!");
    }
}
public class interface1 {
    public static void main(String[] args) {
        Animal s = new Dog();
        s.sound();
    }
}
