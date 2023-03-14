package Q208;

import java.util.Scanner;

public class Main {
    // method to calculate the average marks
    public static Float calculateAverage(int[] marks) {
        Float totalMarks = 0f;
        int numberOfStudents = marks.length;
        for (int index = 0; index < numberOfStudents; index++) {
            totalMarks += marks[index];
        }
        Float averageMark = totalMarks / numberOfStudents;
        return averageMark;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = 10; // scanner.nextInt();
        int[] marks = new int[numberOfStudents];
        for (int index = 0; index < numberOfStudents; index++) {
            try {
                System.out.printf("Enter the mark of student %d: ", index + 1);
                String userInput = scanner.nextLine();
                marks[index] = Integer.parseInt(userInput);
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Please enter a valid number");
                index--;
            } catch (Exception exception) {
                exception.printStackTrace();
            }

        }
        System.out.printf("The average mark of %d students is %f", numberOfStudents, calculateAverage(marks));
        scanner.close();
    }
}
