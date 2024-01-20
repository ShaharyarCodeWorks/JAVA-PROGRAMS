class Demo
{
   int a=10;
   String b="KHATTAK";
   void Show()
   {
    System.out.print(a+""+b);
   }
}
class ClassObject
{
    public static void main(String args[])
    {
        Demo r = new Demo();
        r.Show();
    }
}