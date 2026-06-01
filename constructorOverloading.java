class Student{
    String name;
    int roll ; 

    Student(){
        name="undefined";
        roll = 0;
    }
    Student(String s){
        name = s;
        roll = 0;
    }
    Student(String s, int r){
        name =  s;
        roll = r;
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll : "+roll);
    }
}
public class constructorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        Student s2 = new Student("Himanshu");
        s2.display();
        Student s3 = new  Student("Himanshu", 10585);
        s3.display();
    }
}
