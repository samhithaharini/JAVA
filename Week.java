import java.util.Scanner;
public class Week {
     public static void main(String[] args) {
          Scanner input= new Scanner(System.in);
          int n=input.nextInt();
          String day;
          switch(n){
              case 1:
                    day="Sunday";
                    break;
              case 2:
                    day="Monday";
                    break;
              case 3:
                    day="Tuesday";
                    break;
              case 4:
                    day="Wednesday";
                    break;
              case 5:
                    day="Thursday";
                    break;
              case 6:
                    day="Friday";
                    break;
              case 7:
                   day="Saturday";
                    break;
              default:
                   day="click between 1-7";
                    break;
           }
       System.out.println("Day is " + day);
      }
}