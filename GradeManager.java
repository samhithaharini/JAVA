import java.util.Scanner;
class Student {
    private String name;
    private double hwGrade;
    private double finalGrade;
    public Student(String name, double hwGrade, double finalGrade) {
        this.name = name;
        this.hwGrade = hwGrade;
        this.finalGrade = finalGrade;
    }
    public String getName() {
        return name;
    }

    public double gethwGrade() {
        return hwGrade;
    }

    public double getfinalGrade() {
        return finalGrade;
    }
    public double avgGrade() {
        return (hwGrade + finalGrade) / 2.0;
    }
}

public class GradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter homework grade: ");
        double hwGrade = scanner.nextDouble();

        System.out.print("Enter final exam grade: ");
        double finalGrade = scanner.nextDouble();
        Student student = new Student(name, hwGrade, finalGrade);
        double averageGrade = student.avgGrade();
        System.out.println("Student Name: " + student.getName());
        System.out.println("Homework Grade: " + student.gethwGrade());
        System.out.println("Final Exam Grade: " + student.getfinalGrade());
        System.out.println("Average Grade: " + averageGrade);
    }
}
