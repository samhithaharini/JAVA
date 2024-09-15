import java.util.Scanner;
public class PassFail {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         int mark=input.nextInt();
         String result=(mark>=50) ? "pass":"fail" ;
         System.out.println("You are " + result);
    }
}