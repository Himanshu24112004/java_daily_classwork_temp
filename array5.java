import java.io.*;
import java.util.*;

public class array5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] arr = new int[n];
 
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
 
        int even = 0;
        int odd = 0;
        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
               even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even: "+ even + "," + " Odd: " + odd);
        sc.close();
    }
}