import  java.io.FileInputStream;
import java.io.IOException;

public class fileHandling1 {
    public static void main(String[] args) {
            try{
                FileInputStream fs =  new FileInputStream("useFile.txt");
            }
            catch(IOException e){
                System.out.println("ye galt bat hai !!!...");
            }   
    }
}
