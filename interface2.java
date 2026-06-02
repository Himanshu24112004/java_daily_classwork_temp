interface A {
    void sound();
}

interface B {
    void eat();
}

class C implements A, B {
    public void sound() {
        System.out.println("Sound of C");
    }

    public void eat() {
        System.out.println("C is eating");
    }
}

public class interface2 {
    public static void main(String[] args) {
        A a = new C();
        B b = new C();
        a.sound();
        b.eat();
    }
}
