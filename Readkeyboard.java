import java.util.*;
public class Readkeyboard
{
    public static void main(String arg[])
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            float x,y;
            System.out.println("enter 2 numbers");
            x=sc.nextFloat();
            y=sc.nextFloat();
            float z=x+y;
            System.out.println("Sum=  "+z);
        }
        
    }
}
