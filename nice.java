class Dog{
    String  name ;
    String color ;
        Dog(String n , String c){
            name = n;
            color = c;
        }
        void display(){
            System.out.println("Name : "+name);
            System.out.println("Color : "+color);
        }
}

public class nice {
    public static void main(String[] args) {
        Dog  d = new Dog("Tommy","Black");
            d.display();
    }
}