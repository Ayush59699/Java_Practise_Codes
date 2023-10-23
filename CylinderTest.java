class  Cylinder
{
    private double radius;
    private double height;
    
    public Cylinder()
    {
        radius=height=1;
    }
    public Cylinder(double a)
    {   
        radius=height=a;

    }
    public Cylinder(double r,double h)
    {
        radius=r;
        height=h;
    }
    public double getHeight()
    {
        return height;
    }
    public double getRadius()
    {
        return radius;
    }
    
    public void setHeight(double h)
    {
        if(h>=0)
            height=h;
        else
            height=0;
    }
    public void setRadius(double r)
    {
        if(r>=0)
            radius=r;
        else
            radius=0;
    }
    public void setDimensions(double h,double r)
    {
        height=h;
        radius=r;
    }
    
    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double drumArea()
    {
        return 2*lidArea()+perimeter()*height;
    }
    public double volume()
    {
        return lidArea()*height;
    }
}


public class CylinderTest {

    public static void main(String[] args) {
        Cylinder c=new Cylinder();
        c.setHeight(10);
        c.setRadius(7);
        c.setDimensions(10, 7);
        
        System.out.println("LidArea "+c.lidArea());
        System.out.println("Circumference "+c.perimeter());
        System.out.println("totalSurfaceArea "+c.drumArea());
        System.out.println("Volume "+c.volume());
        System.out.println("Height"+c.getHeight());
        System.out.println("Radius"+c.getRadius());
        
    }
    
}
