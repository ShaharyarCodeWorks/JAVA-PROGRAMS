import java.util.Scanner;
public class Uppercase
 {
    public static void main(String args[])
    {
        Scanner  input = new Scanner(System.in);
        String sentence;
        System.out.print("ENTER SENTENCE:");
        sentence = input.nextLine();
        sentence = sentence.toUpperCase();
        System.out.println(sentence);
    
    }
}
