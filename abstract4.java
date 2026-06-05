import java.util.Scanner;

abstract class shape{
    abstract void area();
    abstract void perimeter();
}

class Circle extends shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    void area(){
        System.out.println("Area of circle: " + (3.14 * radius * radius));
    }
    void perimeter(){
        System.out.println("Perimeter of circle: " + (2 * 3.14 * radius));
    }
}

class Triangle extends shape{
    double side1, side2, side3;
    Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    void area(){
        // Heron's formula for area of triangle
        double s = (side1 + side2 + side3) / 2;
        System.out.println("Area of triangle: " + Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)));
    }
    void perimeter(){
        System.out.println("Perimeter of triangle: " + (side1 + side2 + side3));
    }
}

public class abstract4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int radius = sc.nextInt();
        Circle circle = new Circle(radius);
        circle.area();
        circle.perimeter();


        int side1 = sc.nextInt();
        int side2 = sc.nextInt();   
        int side3 = sc.nextInt();
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.area();
        triangle.perimeter();   

        sc.close();
    }
}
