import java.util.Scanner;

public class revrseString {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

    //    String  str =  sc.next();
    //    String rev = "";

    //    for(int i= str.length()-1; i>=0; i--){
    //     rev += str.charAt(i);
    //    }
    //    System.out.println("Reversed String: " + rev);
    //    sc.close();


    String s = "hellooo";

    // String rev = new StringBuilder(s).reverse().toString();
    // System.out.println(rev);

    char[] ch = s.toCharArray();

    int left = 0;
    int right = ch.length - 1;

    while(left < right){
        char temp = ch[left];
        ch[left] = ch[right];
        ch[right] = temp;
        left++;
        right--;
    }
    System.out.println(new String(ch));
  }
}
