class Shape
{
    void draw()
    {
        System.out.println("CAN'T SAY WHICH SHAPE.");
    } 
}
class Square extends Shape
{
    @Override
    void draw()
    {
        super.draw();
        System.out.println("SQUARE");
    }
}
class Polymorphism_1
{
    public static void main(String args[])
    {
        Shape r= new Square();
         r.draw();
    }
}