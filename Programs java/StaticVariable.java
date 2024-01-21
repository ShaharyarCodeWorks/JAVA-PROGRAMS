import java.util.Scanner;

public class StaticVariable {
    // Static variable
    static int staticSum = 0;
    // Method to perform addition using a static variable
    static void performAddition() {
        Scanner scanner = new Scanner(System.in);
        // Taking input for two numbers
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        // Performing addition using a static variable
        staticSum += num;
    }
    // Method to display the static result
    static void displayStaticResult() {
        System.out.println("Static Sum is: " + staticSum);
    }
    public static void main(String[] args) {
        // Performing addition multiple times
        performAddition();
        performAddition();
        performAddition();
        // Displaying the static result
        displayStaticResult();
    }
}
