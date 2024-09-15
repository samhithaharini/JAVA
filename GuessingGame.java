import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
     public static void main(String[] args) {
             Scanner scanner=new Scanner(System.in);
             Random random=new Random();
             int num=random.nextInt(100)+1;
             int userGuess=0;
             System.out.println("Welcome to the guessing game!");
             System.out.println("I have selected a number between 1 and 100.");
             System.out.println("Can you guess what it is?");
             do{
                System.out.print("Enter your guess: ");
                userGuess=scanner.nextInt();
                if(userGuess<num){
                       System.out.println("Too Low!!");
                }else if(userGuess<num){
                       System.out.println("Too High!!");
                }else{
                       System.out.println("Congratulations! you guessed the correct number");
                }
              }
                while(userGuess!=num);

             scanner.close();
       }
}