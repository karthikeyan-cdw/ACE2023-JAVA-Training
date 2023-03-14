package Q207;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the numerator value:");
            // Getting input for number of students
            String userInput = scanner.nextLine();
            // Condition to break the while loop
            if (userInput.toLowerCase().charAt(0) == 'q') {
                break;
            }
            int numerator = Integer.parseInt(userInput);
            System.out.println("Enter the divisor value:");
            // Getting the value for divisor
            int divisor = scanner.nextInt();
            scanner.nextLine();
            try {
                System.out.println(numerator / divisor);
            } catch (ArithmeticException arithmeticException) {
                arithmeticException.printStackTrace();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        scanner.close();
    }
}
