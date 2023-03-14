package Q204;

public class InvalidAgeForVoteException extends Exception {
    public InvalidAgeForVoteException() {
        System.out.println("You should turned 18 to vote.");
    }
}
