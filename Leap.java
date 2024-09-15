import java.util.Scanner;
public class Leap{
     public static void main(String[] args) {
           Scanner input=new Scanner(System.in);
           int year=input.nextInt();
           if((year%4==0 && year%100!=0) || year%400==0) {
                    System.out.println(year + "is leap year");
           }
           else{
                   System.out.println(year + "is not leap year");
           }
     }
}