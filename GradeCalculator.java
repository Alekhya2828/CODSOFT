import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the number of subjects from the user
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        int totalMarks = 0;
        int[] marks = new int[numSubjects];
        
        // Input marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }
        
        // Calculate average percentage
        double averageMarks = (double) totalMarks / numSubjects;
        
        // Grade assignment logic
        String grade;
        if (averageMarks >= 90) {
            grade = "A";
        } else if (averageMarks >= 80) {
            grade = "B";
        } else if (averageMarks >= 70) {
            grade = "C";
        } else if (averageMarks >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        // Display the results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averageMarks);
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}