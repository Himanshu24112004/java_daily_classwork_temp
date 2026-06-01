final class Animal{
    // final void show(){
    //     System.out.println("show");
    // }
}
class Dog extends Animal{
    void display(){
        System.out.println("show dog");
    }
}
public class final12 {
    public static void main(String[] args) {
        // final int a= 10;
        // System.out.println(a);
        // a=12;
        // System.out.println(a);

        Dog d= new Dog();
        d.show();
    }
}
