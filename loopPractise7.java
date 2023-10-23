import java.util.*;
public class loopPractise7 //REVERSE A NUMBER
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        int num=sc.nextInt();
        sc.close();
        String str="";
        
        while(num>0)
        {
            int r=num%10;
            num=num/10;
            str=str+r;
        }
        System.out.println(str);
    }
    
}
