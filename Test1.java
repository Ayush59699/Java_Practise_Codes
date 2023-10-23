/*class Rectangle12
{
    int length;
    int breadth;
    Rectangle12()
    {
        length=breadth=1;
    }
    Rectangle12(int l, int b)
    {
        length=l;
        breadth=b;
    }
}
class cuboid extends Rectangle12
{
    int height;
    cuboid()
    {height=1;}
    cuboid(int h)
    {
        height=h;
    
    }
    cuboid(int l,int b)
    {
        super(l,b);
        height=1;
    }
    cuboid(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }
    int volume()
    {return length*breadth*height;}

}
public class Test1
{
    public static void main(String args[])
    {
        cuboid c=new cuboid(10,2);
        System.out.println(c.volume());
    }
}*/