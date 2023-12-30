package gradecalculator;
import java.util.*;

public class gradecalculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)) {
			System.out.println("STUDENT GRADE CALCULATOR ");

			System.out.println("Enter the number of subjects:");
			int noOfSubjects = scanner .nextInt();

			float totalMarks = 0;

			for (int i = 1; i <= noOfSubjects; i++) {
			    System.out.println("Enter marks for Subject " + i + ": ");
			    float marks = scanner .nextFloat();
			    totalMarks += marks;

			   
			    System.out.println("Grade for Subject " + i + ": " + getGrade(marks));
			}

			System.out.println("\nTotal Marks: " + totalMarks);
			float avg = totalMarks / noOfSubjects;
			System.out.println("Average Percentage: " + avg);


			System.out.println("Overall Grade: " + getGrade(avg));
		}
    }

    // Function to get the grade based on the provided marks
    private static String getGrade(float marks) 
    {
        if (marks == 100) {
            return "O";
        } else if (marks <= 100 && marks > 90) {
            return "A";
        } else if (marks <= 90 && marks > 80) {
            return "B";
        } else if (marks <= 80 && marks > 70) {
            return "C";
        } else if (marks <= 70 && marks > 60) {
            return "D";
        } else if (marks <= 60 && marks > 50) {
            return "E";
        } else if (marks <= 50) {
            return "Fail";
        } else {
            return "Invalid";
        }
    }
}
