import java.util.Scanner;
public class Comparison {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int num1,num2;
        System.out.print("ENTER NUMBER 1:");
        num1=input.nextInt();
        System.out.print("ENTER NUMBER 2:");
        num2=input.nextInt();
        if(num1==num2)

        System.out.printf("%d==%d%n",num1,num2);
        if(num1!=num2)
        System.out.printf("%d!=%d%n",num1,num2);
        if(num1<num2)
        System.out.printf("%d<%d%n",num1,num2);
        if(num1>num2)
        System.out.printf("%d>%d%n",num1,num2);
        if(num1<=num2)
        System.out.printf("%d<=%d%n",num1,num2);
        if(num1>=num2)
        System.out.printf("%d>=",num1,num2);
        input.close();
    }
    
}
