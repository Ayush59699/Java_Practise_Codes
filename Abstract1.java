abstract class Super
{
    public Super(){System.out.println("Super construvtor");}

    public void meth1()
    {
        System.out.println("Meth 1 of Super");
    }
    abstract public void meth2();
}
class Sub extends Super
{
    public void meth2()
    {
        System.out.println("Sub meth2");
    }
}
public class Abstract1
{
    public static void main(String args[])
    {
        Super s=new Sub();
        s.meth1();
        s.meth2();
        
    }
}