interface Test1
{
    void meth1();
    void meth2();
}

class Test2 implements Test1
{
    public void meth1()
    {
        System.out.println("Test2 ka meth1");

    }
    public void meth2()
    {
        System.out.println("Test2 ka meth 2");

    }
    public void meth3()
    {
        System.out.println("Test2 ka meth3");
    }
}

public class Interface1
{
    public static void main(String args[])
    {
        Test1 t=new Test2();
        t.meth1();
        t.meth2();
        

    }

}