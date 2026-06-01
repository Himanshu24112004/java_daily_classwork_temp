class Student{
    void dispaly(){
        System.out.println("Under display method student class..");
    }
    void sendObject(){
        Helper h = new Helper(this);
    }
}
class  Helper{
    Helper(Student s){
        System.out.println("under Helper class constructor..");
        s.dispaly();
    }
}
public class conceptThis4 {
    public static void main(String[] args) {
        Student s1 =  new Student();
        s1.sendObject();
    }
}
