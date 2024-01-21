import java.util.Scanner;

class Student {
    String name;
    int marks, roll;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name, marks, and roll: ");
        name = scanner.next();
        marks = scanner.nextInt();
        roll = scanner.nextInt();
    }

    void display() {
        System.out.println("Roll: " + roll + ", Marks: " + marks + ", Name: " + name);
    }
}

class Usman extends Student {
    Usman() {
        name = "Usman";
        marks = 85;
        roll = 313;
    }
}
 
public class Inheritance {
    public static void main(String[] args) {
        Usman usman = new Usman();

        // Display default values
        usman.display();

        // Input new values
        usman.input();

        // Display updated values
        usman.display();
    }
}
