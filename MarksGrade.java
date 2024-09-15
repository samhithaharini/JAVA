import java.util.Scanner;
public class MarksGrade {
      public static void main(String[] args) {
           Scanner input=new Scanner(System.in);
           int mark=input.nextInt();
           if(mark>=80) {
                 System.out.println("Grade A");
           }else if(mark>=60) {
                 System.out.println("Grade B");
           }else if(mark>40) {
                 System.out.println("Grade C");
           }else{
                 System.out.println("Fail");
           }
      }
}
