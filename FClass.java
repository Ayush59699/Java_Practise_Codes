import java.util.*;
class Point{
    private int x, y;
    public Point(int x1, int y1)
    {
        x=x1;
        y=y1;
    }
    
    public String toString()
    {
        return("("+x+","+y+")");
    }
    public boolean equals​(Object obj)
    {
        if(x!=((Point)obj).x)
        {
            return false;
        }
        if(y!=((Point)obj).y)
        {
            return false;
        }
        return true;
    }
}

public class FClass{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            
            if(p1.equals(p2))
                System.out.println(p1 + "==" + p2);
            else
                System.out.println(p1 + "!=" + p2);
        }
    }
}