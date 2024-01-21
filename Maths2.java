import java.util.Scanner;
public class Maths2{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int num1,num2,sum=0;
        System.out.print("ENTER NUMBER 1:");
            num1=input.nextInt();
            System.out.print("ENTER NUMBER 2:");
            num2=input.nextInt();
            sum=sum+num1+num2;
            System.out.printf("sum is:\t%s%n",sum);
        

    }
}