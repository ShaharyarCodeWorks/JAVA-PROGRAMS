import java.util.Scanner;
public class Reverse 
{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String sentence;
      System.out.print("Enter a Sentence to reverse:");
      sentence = input.nextLine();
      String reversed = reverse(sentence);
      System.out.println("The reversed sentence is: " + reversed);
    }
    public static String reverse(String sentence) {
      if (sentence.isEmpty())
        return sentence;
  
      return reverse(sentence.substring(1)) + sentence.charAt(0);
    }
  }