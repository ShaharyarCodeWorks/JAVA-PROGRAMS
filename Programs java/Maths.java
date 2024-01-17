import java.util.Scanner;
public class Maths{
    public static void main(String []args){
    Scanner input = new Scanner(System.in);
     
    int number1;
    int number2;
    int sum=0;
    System.out.print("ENTER NUMBER 1:");
    number1 = input.nextInt();
    System.out.print("ENTER NUMBER 2:");
    number2 = input.nextInt();
    sum=sum+number1+number2;
    System.out.printf("sum is %s%n",sum);
    
    }
}