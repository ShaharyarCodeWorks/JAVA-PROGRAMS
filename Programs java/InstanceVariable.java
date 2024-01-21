import java.util.Scanner;

public class InstanceVariable {

    // Instance variables
    int num1, num2, sum;

    // Method to perform addition using instance variables
    void performAddition() {
        Scanner scanner = new Scanner(System.in);

        // Taking input for two numbers
        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();

        // Performing addition using instance variables
        sum = num1 + num2;
    }

    // Method to display the result
    void displayResult() {
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }

    public static void main(String[] args) {
        // Creating an instance of the class
        InstanceVariable example = new InstanceVariable();

        // Performing addition and displaying the result
        example.performAddition();
        example.displayResult();
    }
}
