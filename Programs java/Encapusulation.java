class A 
{
    private int value;
    public void setValue(int x)
    {
      value=x;
    }
    public int getValue()
    {
      return 10+value;
    }
}
class Encapsulation
{
    public static void main(String args[])
    {
        A r = new A();
        r.setValue(100);
        System.out.print(r.getValue());
    }
}
