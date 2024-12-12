import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Number of subjects (You can change it based on the actual number of subjects)
        int numSubjects = 5;
        
        // Array to store marks for each subject
        int[] marks = new int[numSubjects];
        
        // Take input marks for each subject
        System.out.println("Enter marks obtained in " + numSubjects + " subjects:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        
        // Calculate total marks
        int totalMarks = 0;
        for (int i = 0; i < numSubjects; i++) {
            totalMarks += marks[i];
        }
        
        // Calculate average percentage
        double averagePercentage = (totalMarks / (double)(numSubjects));
        
        // Determine grade based on average percentage
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        // Display the results
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        
        // Close the scanner object
        scanner.close();
    }
}
