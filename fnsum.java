//sum of n natural numbers
import java.util.Scanner;
public class fnsum
{
    public static void main(String args[])
    {
        int n,sum=0;
        try (Scanner sc = new Scanner(System.in)) {
            n=sc.nextInt();
        }
        sum=(n*(n+1)/2);
        System.out.println("SUM :"+sum);
    }
}