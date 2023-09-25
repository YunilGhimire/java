package Class6;

import java.util.Scanner;

public class ResultGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();
        double totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for " + i + " Subject : ");
            double marks = sc.nextDouble();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid input");
                return;
            }
            totalMarks += marks;
        }
        double percentage = (totalMarks / (numSubjects * 100)) * 100;
        System.out.println("Percentage: " + percentage + "%");
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B+";
        } else if (percentage >= 60) {
            grade = "B";
        } else {
            grade = "F";
        }
        System.out.println("Grade: " + grade);
    }
}

