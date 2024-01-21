import java.util.Scanner;
public class Array
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int arr[]=new int [5];
        int i,j;
        for( i=0;i<5;i++)
        {
        System.out.println("Enter any 5 numbers:");
        arr[i]=input.nextInt();
        }
        System.out.println("Entered numbers:");
         for( j=0;j<5;j++)
         {
            System.out.println(arr[j]);
         }
    }
}