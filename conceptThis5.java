// "this" is used for method chaining  ....
class  Student{
    String name ;
    int roll ;

    Student setName(String name){
        this.name = name;
        return this ;
    }

    Student setRoll(int roll){
        this.roll=roll;
        return this;
    }
    void dispaly(){
        System.out.println("Name : "+ name);
        System.out.println("Roll : "+roll);
    }
}
public class conceptThis5 {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Himanshu Kumar ").setRoll(25).dispaly();
    }
}
