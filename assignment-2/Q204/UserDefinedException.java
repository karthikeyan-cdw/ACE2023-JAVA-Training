package Q204;

import java.util.Scanner;

import javax.naming.directory.InvalidSearchControlsException;

public class UserDefinedException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("User Defined Exception");
        try {
            System.out.println("Enter you age:");
            int age = scanner.nextInt();
            if (age < 18) {
                scanner.close();
                throw new InvalidAgeForVoteException();
            }
            System.out.println("You're eligible for vote");
        } catch (InvalidAgeForVoteException invalidAgeForVoteException) {
            invalidAgeForVoteException.printStackTrace();
        }

        scanner.close();
    }
}
