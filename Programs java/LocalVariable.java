import java.util.Scanner;

public class LocalVariable {
    public static void main(String[] args) {
        // Local variables
        int num1, num2, sum;
        // Taking input for two numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();
        // Performing addition using local variables
        sum = num1 + num2;
        // Displaying the result
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        // Local variable within a block
        {
            int blockVariable = 50;
            System.out.println("Block Variable: " + blockVariable);
        }
    }
}
