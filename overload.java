//method overloading means method with same name but different parameter 
public class overload {
    static void add(int a, int b){
        System.out.println(a+b);
    }
    static void add(int a, int b,int c){
        System.out.println(a+b+c);
    }
    static void add(int a, int b ,int c , int d){
        System.out.println(a+b+c+d);
    }
    static void add(int a, int b,int c, int d, int e){
        System.out.println(a+b+c+d+e);
    }
    static void sqr(int a){
        System.out.println(a*a);
    }
    static void sqr(double b){
        System.out.println(b*b);
    }
    static void dif(int a, double b){
        System.out.println(a-b);
    }
    static void dif(double a , int b){
        System.out.println(a-b);
    }
    public static void main(String[] args) {
        add(2,3, 0);
        add(4, 5, 7);
        add(5, 6, 8, 9);
        add(4, 5, 6, 2, 6);
        sqr(5.0);
        sqr(6);
        dif(7, 8.0);
        dif(9.0, 5);
    }
}
