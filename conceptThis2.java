// this is used to invoke current class constructor ..
class Student {
    Student(){
        System.out.println("non parameterized constructor .. ");
    }
    Student(int n){
        this();
        System.out.println("parameterized constructor .. ");
    }
}
class Student1 {
    Student1(){
        this(32);
        System.out.println("non parameterized constructor .. ");
    }
    Student1(int n){
        System.out.println("parameterized constructor .. ");
    }
}
public class conceptThis2 {
    public static void main(String[] args) {
        Student s1 = new Student(5);
        Student1 s2 = new Student1();
    }
}
