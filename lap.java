class laptop{
    String name;
    int mfg;
    String company;
    void speci(){
        System.out.println("name : "+ name);
        System.out.println("MFG : "+mfg);
        System.out.println("Coompany : "+company);
    }
}

class circle{
    int rad;
    void area(){
        System.out.println("area is = "+(3.14*rad*rad));
    }
}
class employeee{
    String name;
    int salary;
    void detail(){
        System.out.println("Name : "+name);
        System.out.println("Salary : "+ salary);
    }
}
class  book{
    String name ;
    String author;
    void pr(){
        System.out.println("Name : "+name);
        System.out.println("Author : "+author);
    }
}

public class lap {
    public static void main(String[] args){
        // laptop l1 = new laptop();
        // l1.name= "jarvis";
        // l1.mfg= 1995;
        // l1.company= "asus";

        // l1.speci();

        // laptop l2 = new laptop();
        // l2.name = "alexa";
        // l2.company="hp";
        // l2.mfg= 2003;
        // l2.speci();

        // circle c1= new circle();
        // c1.rad=4;
        // c1.area();


        employeee e1 = new employeee();
        e1.name= "Himanshu";
        e1.salary= 10000000;
        e1.detail();

        book b1  = new book();
        b1.name= "The favourite Girl ";
        b1.author="Himanshu Kumar";
        b1.pr();
    }
    
}
