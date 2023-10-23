import java.util.Scanner;
public class fibb
{
    public static int fibbo(int n)
    {
        if(n==1 || n==2)
        {
            return 1;
        }
        return fibbo(n-1)+fibbo(n-2);
    }
    public static void main(String args[])
    {
        int n;
        try (Scanner sc=new Scanner(System.in))
        {
            n=sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                System.out.print(fibbo(i)+" ");
            }
        }
    }   
}

