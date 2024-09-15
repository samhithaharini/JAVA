import java.util.Scanner;
public class Bmi {
      public static void main(String[] args) {
              Scanner input=new Scanner(System.in);
              int height=input.nextInt();
              int weight=input.nextInt();
              int h=height*height;
              int bmi=weight/h;
              System.out.println("BMI: " + bmi);
              if(bmi<18.5) {
                    System.out.println("Underweight");
               }
              else if(bmi>=18.5 && bmi<24.9) {
                    System.out.println("Normal Weight");
              }
              else if(bmi>=25 && bmi<29.9) {
                    System.out.println("Overweight");
              }
              else{
                   System.out.println("Obesity");
              }
        }
}