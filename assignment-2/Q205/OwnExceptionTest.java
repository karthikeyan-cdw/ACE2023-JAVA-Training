package Q205;

import java.util.Scanner;

import Q204.InvalidAgeForVoteException;

public class OwnExceptionTest {
    public static void main(String[] args) throws InvalidAgeForVoteException {
        System.out.println("Enter your age:");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18) {
            scanner.close();
            throw new InvalidAgeForVoteException();
        } else {
            System.out.println("You're eligible for vote");
        }
        scanner.close();
    }
}
