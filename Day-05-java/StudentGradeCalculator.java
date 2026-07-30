import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        int total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Marks of Subject " + i + ": ");
            total += sc.nextInt();
        }

        double average = total / 5.0;

        char grade;

        if (average >= 90)
            grade = 'A';
        else if (average >= 80)
            grade = 'B';
        else if (average >= 70)
            grade = 'C';
        else if (average >= 60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("========================");
System.out.println("   STUDENT REPORT CARD");
System.out.println("========================");
        System.out.println("Student Name : " + name);
        System.out.println("Total Marks  : " + total);
        System.out.println("Average      : " + average);
        System.out.println("Grade        : " + grade);

        sc.close();
    }
}