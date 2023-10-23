import java.util.*;
public class simple_interest
//simple interest
{
    public static void main(String arg[])
    {
        try (Scanner sc=new Scanner(System.in)) 
        {
            Float p,r,t;
            System.out.println("Enter p,r,t");
            p=sc.nextFloat();
            r=sc.nextFloat();
            t=sc.nextFloat();
            Float z=(p*r*t)/100;
            System.out.println("S.I.="+z);
        }
    }
}
