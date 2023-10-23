import java.util.*;
public class FindLeap 
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            long yr;
            yr=sc.nextLong();
            if(yr%4==0)
            {
                if(yr%100==0)
                {
                    if(yr%400==0)
                    {
                        System.out.println("YES leap");
                    }  
                    else
                    {
                        System.out.println("NOT leap");
                    }
                }
                else{
                    System.out.println("YES leap");
                }
            }
            else
            {
                System.out.println("NOT leap");
            }
        }
    }    
}
