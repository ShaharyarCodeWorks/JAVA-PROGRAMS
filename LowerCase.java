import java.util.Scanner;
public class LowerCase
{
    public static void main(String args[])
    {
        String sentence;
        Scanner  input = new Scanner(System.in);
        System.out.print("Enter a sentence:");
        sentence = input.nextLine();
        sentence = sentence.toLowerCase();
        System.out.print(sentence);
    }
}