import java.util.*; // DISPLAY DIGITS OF A NUMBER
public class loopPractise4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        sc.close();
        int rem;
        while(num>0)
        {
            rem=num%10;
            num=num/10;
            System.out.println(rem);

        }

    }

}