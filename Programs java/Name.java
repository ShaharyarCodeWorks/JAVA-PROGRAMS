import java.util.Scanner;
class Name
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.print("ENTER YOUR NAME:");
        name = input.nextline();
        System.out.print("YOUR NAME IS "+name);
    }
}