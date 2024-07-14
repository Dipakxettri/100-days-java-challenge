
//Students Marks Management System

import java.util.Scanner;

class StudentManagement {

    // Private member variables to store marks of six subjects
    private int subject1Mrks;
    private int subject2Mrks;
    private int subject3Mrks;
    private int subject4Mrks;
    private int subject5Mrks;
    private int subject6Mrks;
    private float totalMrks;
    private float totalMaxMrks = 600; // Total max marks for 6 subjects

    // Methods to set the marks for each subject
    public void setMrksOfSub1(int a) {
        subject1Mrks = a;
    }

    public void setMrksOfSub2(int b) {
        subject2Mrks = b;
    }

    public void setMrksOfSub3(int c) {
        subject3Mrks = c;
    }

    public void setMrksOfSub4(int d) {
        subject4Mrks = d;
    }

    public void setMrksOfSub5(int e) {
        subject5Mrks = e;
    }

    public void setMrksOfSub6(int f) {
        subject6Mrks = f;
    }

    // Method to calculate the total marks obtained
    private float getTotalMrks() {
        return subject1Mrks + subject2Mrks + subject3Mrks + subject4Mrks + subject5Mrks + subject6Mrks;
    }

    // Method to calculate the percentage of total marks
    public float getPercentage() {
        totalMrks = getTotalMrks(); // Calculate total marks
        return (totalMrks / totalMaxMrks) * 100; // Calculate percentage
    }

    // Method to calculate the GPA
    public float getGPA() {
        totalMrks = getTotalMrks(); // Calculate total marks
        return (totalMrks / totalMaxMrks) * 4.0f; // Calculate GPA assuming a scale of 4
    }
}

public class Main {
    public static void main(String[] args) {

        // Create an instance of StudentManagement
        StudentManagement sy = new StudentManagement();
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt and read marks for each subject from the user
        System.out.print("  Enter the Marks of subject 1: ");
        int sub1 = sc.nextInt();
        sy.setMrksOfSub1(sub1);

        System.out.print("  Enter the Marks of subject 2: ");
        int sub2 = sc.nextInt();
        sy.setMrksOfSub2(sub2);

        System.out.print("  Enter the Marks of subject 3: ");
        int sub3 = sc.nextInt();
        sy.setMrksOfSub3(sub3);

        System.out.print("  Enter the Marks of subject 4: ");
        int sub4 = sc.nextInt();
        sy.setMrksOfSub4(sub4);

        System.out.print("  Enter the Marks of subject 5: ");
        int sub5 = sc.nextInt();
        sy.setMrksOfSub5(sub5);

        System.out.print("  Enter the Marks of subject 6: ");
        int sub6 = sc.nextInt();
        sy.setMrksOfSub6(sub6);

        // Calculate and display the percentage and GPA
        System.out.println("  Percentage: " + sy.getPercentage() + "%");
        System.out.println("  GPA: " + sy.getGPA());

        // Close the scanner
        sc.close();
    }
    }
          
