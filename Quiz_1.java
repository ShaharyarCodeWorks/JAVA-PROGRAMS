import java.util.Scanner;
public class Quiz_1{
    public static void main(String args[])
    {
        boolean blue=true;
        String ans;
        
        Scanner input = new Scanner(System.in);
        System.out.print("WHAT IS THE SKY'S COLOUR:");
        ans = input.nextLine();
        if(ans.equalsIgnoreCase("blue")){
            System.out.println("CORRECT ANSWER!");
        }else{
            System.out.println("WRONG ANSWER!");
        }
    }

}