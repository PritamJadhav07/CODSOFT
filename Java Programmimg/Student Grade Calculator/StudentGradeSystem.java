import java.util.*;

public class StudentGradeSystem {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Student Grade Calculator.");
        System.out.print("Enter your Number of Subjects : ");
        int NumofSubjects = sc.nextInt();

        // Input Marks
        int marks[] = new int[NumofSubjects];
        int Total_Marks = 0;

        for (int i = 0; i < NumofSubjects; i++) {
            System.out.print("Enter your Subject " + (i + 1) + " Marks: ");
            marks[i] = sc.nextInt();
            Total_Marks += marks[i];
        }

        double Percentage = (double) Total_Marks / (NumofSubjects * 100) * 100;

        System.out.println("Your Result : ");
        System.out.println("Total Marks = " + Total_Marks);
        System.out.println("Percentage = " + Percentage);

        char Grade = GradeCalculator(Percentage);
        System.out.println("Your Grade : " + Grade);

    }

    public static char GradeCalculator(double Percentage) {
        if (Percentage >= 90) {
            return 'A';
        } else if (Percentage >= 80) {
            return 'B';
        } else if (Percentage >= 70) {
            return 'C';
        } else if (Percentage >= 60) {
            return 'D';
        } else if (Percentage <= 35 && Percentage >= 60) {
            return 'E';
        } else if (Percentage < 35) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid Input");
        }
        return 0;

    }

}