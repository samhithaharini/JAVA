import java.util.Scanner;

public class SimpleCalculator {
    double add(double a, double b) {
        return a + b;
    }
    double subtract(double a, double b) {
        return a - b;
    }
    double multiply(double a, double b) {
        return a * b;
    }
    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return a;
        }
        return a / b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleCalculator calculator = new SimpleCalculator();

        while (true) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            System.out.print("Choose an operation (add, subtract, multiply, divide): ");
            String operation = scanner.next();

            double result = 0;
            boolean validOperation = true;
            switch (operation.toLowerCase()) {
                case "add":
                    result = calculator.add(num1, num2);
                    break;
                case "subtract":
                    result = calculator.subtract(num1, num2);
                    break;
                case "multiply":
                    result = calculator.multiply(num1, num2);
                    break;
                case "divide":
                    result = calculator.divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operation. Please choose add, subtract, multiply, or divide.");
                    validOperation = false;
                    
            }
            if (validOperation) {
                System.out.println("The result is: " + result);
            }            
        }
    }
}
