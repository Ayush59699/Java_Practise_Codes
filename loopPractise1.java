//sum of first n natural numbers
import java.util.*;
public class loopPractise1
{
    public static void main(String args[]) 
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        int sum1=0;
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            sum1=sum1+i;
            
        }
        System.out.println(sum1);

        
    }
}