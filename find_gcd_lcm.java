import java.util.Scanner;

public class find_gcd_lcm {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a , y = b;
        while(a%b!=0){
            int rem  = a%b;
            a=b;
            b=rem;
        }
        int gcd = b;
        int lcm = (x*y)/gcd;

        System.out.print(gcd+" ");
        System.out.println(lcm);
        sc.close();
    }
}
