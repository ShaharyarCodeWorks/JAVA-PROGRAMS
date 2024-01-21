import java.util.Scanner;
public class Hesco{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        int bill=0,unit=0;
        System.out.print("ENTER UNITS CONSUMED:");
        unit = input.nextInt();
        if(unit<=100){
        unit=unit*10;
        System.out.print("YOUR BILL IS ="+unit);
        }else if(unit>100&&unit<=200){
        unit=unit*20;
        System.out.print("YOUR BILL IS ="+unit);
        }else if(unit>200&&unit<=300){
            unit=unit*30;
            System.out.print("YOUR BILL IS ="+unit);
        }else if(unit>300&&unit<=400){
            unit=unit*40;
        System.out.print("YOUR BILL IS ="+unit);
        }else{
        unit=unit*50;
        System.out.print("YOUR BILL IS ="+unit);
    }
    }
}
