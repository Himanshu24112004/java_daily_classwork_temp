abstract class Animal{
    abstract void sound();
}

class Lion extends Animal{
    public void sound(){
        System.out.println("Lion makes sound!!!");
    }
}

class Tiger extends Animal{
    public void sound(){
        System.out.println("Tiger makes sound!!!");
    }
}

public class abstract3 {
    public static void main(String[] args) {
        
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        
        lion.sound();
        tiger.sound();
    }
}
