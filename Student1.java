class student{
    String name;
    int erp;

    void display(){
        System.out.println("Name : "+name);
        System.out.println("ERP : "+erp);
    }
}
public class Student1{
    public static void main(String[] args) {
        student s1=new student();
        s1.name="Himanshu Kumar";
        s1.erp=10585;
        s1.display();
    }
}