import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("******************************");
        System.out.println();
        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = scanner.nextInt();
        System.out.println("Pyramid Pattern:");
        for (int i = 1; i <= rows; i++) {
            // Print spaces before the asterisks
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
          }
            // Move to the next line after each row
             System.out.println();
        }
        scanner.close(); 
    }
}

