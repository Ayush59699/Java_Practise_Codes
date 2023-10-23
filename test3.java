/*import java.util.*;
class Shape{
    public int area() {
        return 0;
    }
    public int volume() {
        return 0;
    }
}

class Rectangle extends Shape{
    private int w, h;
    public Rectangle(int wp, int hp)
    {
        w=wp;
        h=hp;
    }
    public int area(){return w*h;}
}

class Cube extends Rectangle
{
    private int a;
    public  Cube(int ap)
    {a=ap;}
    public int area(){return 6*a*a;}
}
class test3
{
    private static void caller(Shape s)
    {
        if(s instanceof Rectangle)
        {
            System.out.println(s.area());
        }
        if(s instanceof Cube)
        {
            System.out.println(s.volume());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int a = sc.nextInt();
        sc.close();
        caller(new Rectangle(w, h));
        caller(new Cube(a));
    }
}*/