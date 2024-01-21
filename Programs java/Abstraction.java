abstract class Vehicle
{
    Vehicle()
{
        System.out.println("BOTH ARE VEHICLES!");
 
}
   public abstract void engine();
}
class Car extends Vehicle
{
    Car()
    {
        super();
    }
    public void engine()
    {
        System.out.println("Petrol Engine");
    }
}
class Jeep extends Vehicle
{
    Jeep()
    {
        super();
    }
    public void engine()
    {
        System.out.println("Diesel Engine");
}
}
public class Abstraction
{
    public static void main(String[] args)
     {
        Car c=new Car();
        Jeep j=new Jeep();
        c.engine();
        j.engine();
    }
}
