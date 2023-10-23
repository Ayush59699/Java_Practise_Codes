import java.util.Scanner;
public class TriangleArea
{
    public static void main(String args[])
    {
        float b;
        float h;

        try (Scanner sc=new Scanner(System.in)){
            System.out.println("Enter base:");
            b=sc.nextFloat();
            System.out.println("Enter height");
            h=sc.nextFloat();
            float area=(b*h)/2;
            System.out.println("AREA:" +area +" sq units");
        }


    }
}