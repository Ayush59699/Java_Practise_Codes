class Rect
{
    private double length;
    private double breadth;

    public double getLength()
    {
        return length;
    }
    public double getBreadth()
    {
        return breadth;
    }
    public void setLength(double l)
    {
        length=l;
    }
    public void setBreadth(double b)
    {
        breadth=b;
    }

    public double area(){
        return(getLength()*getBreadth());

    }
    public double perimeter(){
        return (length+breadth)*2; 
    }
    public boolean isSquare(){
        return(length==breadth);
    }
}
public class Rectangle
{
    public static void main(String args[]){
    Rect s=new Rect();
    //s.length=12;
    //s.breadth=23;
    s.setLength(12.56);
    s.setBreadth(14.35);
    System.out.println("Area: "+s.area());
    System.out.println("Perimeter: "+s.perimeter());
    }


}