import java.util.Scanner;
public class Product {
   public static void main(String []args)
   {
    Scanner input=new Scanner(System.in);
    int x,y,z,result=0;
    System.out.println("ENTER X NUMBER:");
    x = input.nextInt();
    System.out.print("ENTER NUMBER Y:");
    y = input.nextInt();   
    System.out.print("ENTER NUMBER Z:");
    z = input.nextInt();
    result=result+x*y*z;
    System.out.printf("product OF NUMBERS is:%n%d",result);
}
    
}
