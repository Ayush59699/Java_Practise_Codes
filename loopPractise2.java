import java.util.*;
public class loopPractise2 
{
    //FACTORIAL OF A NUMBER
    public static void main(String args[])
    {
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;

        }
        System.out.println(fact);
    }
    
}
