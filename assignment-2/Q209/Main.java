package Q209;

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
        int numberOfStudents = 10;
        int[] marks = new int[numberOfStudents];
        int index = 0;
        while (index < numberOfStudents) {
            try {
                System.out.printf("Enter the mark of student %d: ", index + 1);
                String userInput = scanner.nextLine();
                marks[index] = Integer.parseInt(userInput);
                if (marks[index] < 0) {
                    throw new NegativeNumberException();
                }
                if (marks[index] < 0 && marks[index] > 100)
                    throw new MarkOutOfRangeException();
                index++;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Please enter a valid number");
            } catch (MarkOutOfRangeException markOutOfRangeException) {
                markOutOfRangeException.printStackTrace();
            } catch (NegativeNumberException negativeNumberException) {
                negativeNumberException.printStackTrace();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        System.out.printf("The average mark of %d students is %f", numberOfStudents, calculateAverage(marks));
        scanner.close();
    }
}

class NegativeNumberException extends Exception {
    NegativeNumberException() {
        super();
        System.out.println("Enter a positive number");
    }
}

class MarkOutOfRangeException extends Exception {
    MarkOutOfRangeException() {
        super();
        System.out.println("Enter the mark between 0 and 100");
    }
}