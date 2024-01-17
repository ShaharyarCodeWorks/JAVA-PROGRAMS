import java.util.Scanner;
 
public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creating an Account object
        Account myAccount = new Account();

        // Displaying the initial name
        System.out.printf("Initial name is: %s%n", myAccount.getName());

        // Prompting the user to enter the name
        System.out.println("Please enter the name:");
        String theName = input.nextLine();

        // Setting the name in the Account object
        myAccount.setName(theName);

        // Displaying the updated name
        System.out.println();
        System.out.printf("Name in object account is: %s%n", myAccount.getName());
        input.close();
    }
}
