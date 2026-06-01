class Cat {
    String name;

    Cat(String catName) {
        name = catName;
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("Whiskers");
    }
}