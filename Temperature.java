import java.util.Scanner;
public class Temperature {
     public static void main(String[] args){
          Scanner input=new Scanner(System.in);
          double fahrenheit = input.nextDouble();
          double celsius = (fahrenheit - 32) * 5/9;
          System.out.println("Celsius: " + celsius);
     }
}