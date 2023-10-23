import java.util.Scanner;
public class TriangleArea1
{
    public static void main(String args[])
    {
        try (Scanner sc=new Scanner(System.in)){
            float a,b,c;
            a=sc.nextFloat();
            b=sc.nextFloat();
            c=sc.nextFloat();
            float s=(a+b+c)/2f ;
            double area;
            area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("area: "+area);
        }
    }
}
