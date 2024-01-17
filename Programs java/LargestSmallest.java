import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d, e;

        System.out.print("\nENTER NUMBER:");
        a = input.nextInt();
        System.out.print("\nENTER NUMBER:");
        b = input.nextInt();
        System.out.print("\nENTER NUMBER:");
        c = input.nextInt();
        System.out.print("\nENTER NUMBER:");
        d = input.nextInt();
        System.out.print("\nENTER NUMBER:");
        e = input.nextInt();
        System.out.printf("ENTERED NUMBER ARE\n%d%n%d\n%d%n%d\n%d%n", a, b, c, d, e);

         System.out.println("\n");

        if (a > b && a > c && a > d && a > e) {
            System.out.printf("%d is the largest", a);
        } else if (b > a && b > c && b > d && b > e) {
            System.out.printf("%d is the largest", b);
        } else if (c > a && c > b && c > d && c > e) {
            System.out.printf("%d is the largest", c);
        } else if (d > a && d > b && d > c && d > e) {
            System.out.printf("%d is the largest", d);
        } else {
            System.out.printf("%d is the largest", e);
        }

        System.out.println("\n");
        
        if (a < b && a < c && a < d && a < e) {
            System.out.printf("%d is the smallest", a);
        } else if (b < a && b < c && b < d && b < e) {
            System.out.printf("%d is the smallest", b);
        } else if (c < a && c < b && c < d && c < e) {
            System.out.printf("%d is the smallest", c);
        } else if (d < a && d < b && d < c && d < e) {
            System.out.printf("%d is the smallest", d);
        } else {
            System.out.printf("%d is the smallest", e);
        }
    }
       input.close();
}
