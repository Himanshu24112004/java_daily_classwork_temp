class Car{
    String name ;
    long pr;

    Car(String s, long p){
        name =   s;
        pr = p;
    }
    Car(Car c){
        name = c.name;
        pr = c.pr;
    }
    void display(){
        System.out.println("Brand : "+name);
        System.out.println("Price : " +pr);
    }
}
public class carOverload {
    public static void main(String[] args) {KO
        Car c1 = new Car("BMW", 20000000);
        c1.display();
        Car c2 = new Car(c1);
        c2.display();
    }
}
