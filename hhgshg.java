import java.util.Scanner;

public class hhgshg {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        int height = sc.nextInt();

        for(int i=0; i<height; i++){
            for(int s= height-i; s>=1; s--){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=height-1; i>=0; i--){
            for(int s= height-i; s>=1; s--){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
