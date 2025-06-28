//codeeeee

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input student details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        String roll = sc.nextLine();

        // Number of subjects
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        String[] subjects = new String[n];
        int[] marks = new int[n];
        int total = 0;

        // Input subject names and marks
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Subject " + (i + 1) + " name: ");
            subjects[i] = sc.next();
            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        // Calculate average
        double average = (double) total / n;

        // Grade logic
        String grade;
        if (average >= 90) grade = "A+";
        else if (average >= 80) grade = "A";
        else if (average >= 70) grade = "B";
        else if (average >= 60) grade = "C";
        else if (average >= 50) grade = "D";
        else grade = "F";

        // Display Report
        System.out.println("\n------ Report Card ------");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        for (int i = 0; i < n; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }
        System.out.println("Total Marks: " + total);
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Grade: " + grade);
    }
}

    
