import java.util.*;  //COUNT DIGITS OF A NUMBER
public class loopPractise5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        int count=0,rem=0;
        while(num>0)
        {
            rem=num%10;
            num=num/10;
            count+=1;
            
        }
        System.out.println("length of number ="+count+"reminder="+rem);
        
    }

}