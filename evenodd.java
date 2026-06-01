// public class evenodd {
//     public static void evenOdd(int n){
//         if(n%2==0){
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("Odd");
//         }
//     }
//     public static void main(String[] args) {
//         evenOdd(5);
//     }
// }


// public class evenodd {
//     public static boolean isOdd(int n){
//         if(n%2==0){
//             return false;
//         }
//         else{
//            return true;
//         }
//     }
//     public static void main(String[] args) {
//        System.out.println(isOdd(5));
//     }
// }


public class evenodd {
    public static boolean isOdd(int n){
        return n%2!=0;
    }
    public static void main(String[] args) {
       System.out.println(isOdd(5));
    }
}
