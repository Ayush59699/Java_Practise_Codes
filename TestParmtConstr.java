class parent
{
    parent()
    {
        System.out.println("0 P");
    }
    parent(int x)
    {
        System.out.println("1 P");
    }
}
class child extends parent
{
    child()
    {
        System.out.println("0 C");
    }
    child(int a)
    {
        System.out.println("1 C");
    }
    child(int c, int d)
    {
        System.out.println("2 C");

    }
}
public class TestParmtConstr
{
    public static void main(String args[])
    {
        /*parent p=new parent();
        /*parent g=new parent(10);
        /*child c=new child();
        /*child d=new child(10);
        /*child f=new child(10,20);*/
    }
}