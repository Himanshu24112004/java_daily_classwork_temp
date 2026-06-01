//  "this" is used to pass current class object as a parameter to the method 
class Student{
    void display(){
        System.out.println("under display method student class ..");
    }
    void sendObject(){
        Helper.show(this); // this-> s1
    }
}
class Helper{
    static void show(Student s){  // s = s1 
        System.out.println("Show method under  helper class .. ");
        s.display();
    }
}
public class conceptThis3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.sendObject();
    }
}
