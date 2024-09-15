import java.util.Scanner;
public class Fact{
     public static void main(String[] args){
         Scanner scanner=new Scanner(System.in);
         System.out.print("Enter a non negative number: ");
         int n=scanner.nextInt();
         if(n<0){
             System.out.println("The number must be non negative");
            }else{
                long factorial=1;
                for(int i=1;i<=n;i++){
                    factorial*=i;
                }
            System.out.printf("Factorial of %d is %d%n",n,factorial);
            }
           scanner.close();
      }
}
             