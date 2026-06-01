import java.util.Scanner;

public class checkinvalidtestcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if(!sc.hasNextInt()){
            System.out.println("invalid input");
            return ;
        }
        int test = sc.nextInt();
        while(test-->0){
            if(sc.hasNextInt()){

            
            int h = sc.nextInt();
            int charge = 0;
            if(h<0){
                System.out.println("inavalid duration");
            }
            else if(h<=3){
            charge = h*120;
            }
            else if(h>3 && h<=7){
                charge = (3*120)+((h-3)*60);
            }
            else{
                charge = (3*120)+(4*60)+((h-7)*25);
            }
            System.out.println(charge);
          }
          else{
                System.out.println("invalid input");
          }  
        }
    }
}
