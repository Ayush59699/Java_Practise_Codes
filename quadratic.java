import java.util.Scanner;
public class quadratic
{
    public static void main(String args[])
    {
        try (Scanner sc=new Scanner(System.in))
        {
            float a,b,c;
            System.out.println("Enter roots below: ");
            a=sc.nextFloat();
            b=sc.nextFloat();
            c=sc.nextFloat();
            double r1,r2 ;
            r1=(-b+ Math.sqrt(b*b-4*a*c))/2*a;
            r2=(-b- Math.sqrt(b*b-4*a*c))/2*a;
            System.out.println("ROOTS ARE : "+r1+"  "+r2);
        }

    }
}

    