import java.util.Scanner;
public class Divisible{
    public static void main(String[] args){
          Scanner scanner=new Scanner(System.in);
          System.out.println("Enter the upper limit");
          int n=scanner.nextInt();
          System.out.println("Enter the divisor:");
          int d=scanner.nextInt();
          int i=1;
          if(d==0){
               System.out.println("The divisor cant be zero");
          }
          else{
              boolean found=false;
              for( i=1;i<=n;i++){
                  if(i%d==0){
                       System.out.println("The first number divisible by"+d+"is"+i);
                       found=true;
                       break;
                  }
              }
           if(!found){
                  System.out.println("No number in the range from 1 to" +i+"is divisible by "+d);
           }
         }
       scanner.close();
     }
}