class Teacher{
    String name ;
    int id ;
    // "this" is used refer current class instance variable .
    Teacher(String name , int id){
        this.name = name ;
        this.id = id;
    }
    // instance method
    void display(){ 
        System.out.println("Name : "+name);
        System.out.println("I'd : "+id);
    }
    //  "this" is  used to invoke current class instance method . It  is optional in method application .
    void show(){
        this.display();
        System.out.println("congratulations sirr !!");
    }
}
public class conceptThis {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Soumik", 323232);
        t1.display();
        t1.show();
    }
}
