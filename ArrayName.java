import java.util.Scanner;

public class ArrayName {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String arr[] = new String[5];
        String name;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a name:");
            arr[i] = input.nextLine();
        }
        System.out.println("Entered names are:");
        for (int j = 0; j < 5; j++) {
            System.out.println(arr[j]);
        }
    }
}
