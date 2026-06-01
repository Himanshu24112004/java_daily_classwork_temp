
class student{
    String name ;
    int ERP;
    void display(){
        System.out.println("Name : "+name);
        System.out.println("ERP: "+ERP);
    }
}    
class rect{
    int length;
    int breadth;
    void area(){
        System.out.println("Area = "+ length*breadth);
    }
}    

public class jump {
    public static void main(String[] args) {
        student S1= new student();
        S1.name ="Rahul";
        S1.ERP = 10585;
        S1.display();


        rect r1 = new rect();
            r1.length= 15;
            r1.breadth=20;
            r1.area();
            

    


    }
    
}
