import java.util.Scanner;

public class NumberGuess{
    public static void main(String[] args) {
        // MINI PROJECT
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100) + 1; // Generate a random number between 1 and 100
        int userNumber;

        do {
            System.out.println("Guess my number:");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("WOHOOO.. Correct number!!");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("YOUR NUMBER IS TOO LARGE.");
            } else if (userNumber < myNumber) {
                System.out.println("YOUR NUMBER IS TOO SMALL.");
            }
            
        } while (userNumber != 0);
    }
}
