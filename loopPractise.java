import java.util.*;
public class loopPractise
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number :");
        int n;
        n=sc.nextInt();
        sc.close();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"X"+i+"="+n*i);
        }
        
    }
}