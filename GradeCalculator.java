import java.util.Scanner;
public class GradeCalculator 
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            float a,b,c;
            a=sc.nextFloat();
            b=sc.nextFloat();
            c=sc.nextFloat();
            float avg=(float)((a+b+c)/3);
            if(avg>=80)
            {
                System.out.println("Grade : A");
            }
            else if(avg<80 && avg>=60)
            {
                System.out.println("Grade : B");
            }
            else if(avg<60 && avg>=40)
            {
                System.out.println("Grade : C");
            }
            else
            {
                System.out.println("Grade : FAIL");
            }
        }


    }
    
}
