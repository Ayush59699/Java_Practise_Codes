import java.util.Scanner;
public class cuboidArea 
{
    public static void main(String args[])
    {
        try (Scanner sc=new Scanner(System.in))
        {
            float l,b,h;
            System.out.println("Enter L , B , H  below : ");
            l=sc.nextFloat();
            b=sc.nextFloat();
            h=sc.nextFloat();
            double totalArea,surfaceArea,perim;
            totalArea=l*b*h;
            surfaceArea=2*(l*b+b*h+h*l);
            perim=4*(l+b+h);
            System.out.println("Area= "+totalArea+" cb units");
            System.out.println("Surface Area= "+surfaceArea+" sq units");
            System.out.println("Perimeter= "+perim+" units");
        }
    }       
}
