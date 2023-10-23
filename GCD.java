import java.util.Scanner;
public class GCD
{
    public static int gcd(int a, int b)
    {
        while(((a>0)&&(b>0)))
        {
            if((a>b))
            {
                a=a%b;
            } 
            else 
            {
                b=b%a;
            }
        }
        if(a==0)
        {
            return b;
        }
        else{
            return a;}
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println(GCD.gcd(a,b));
        }
    }   
}
