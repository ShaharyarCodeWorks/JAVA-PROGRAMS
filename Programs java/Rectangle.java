import java.util.Scanner;
class Rectangle
{
    public static void main(String args[])
    {
         float length,width,area;
         Scanner input = new Scanner(System.in);
         System.out.print("ENTER LENGTH:");
         length = input.nextFloat();
         System.out.print("ENTER WIDTH:");
         width  = input.nextFloat();
         area   = length * width;
         System.out.print("AREA OF RENTANGLE IS: "+area);
          input.close(); // to avoid resource leak
        }

    }
