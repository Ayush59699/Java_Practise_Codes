import java.util.*;
public class starPattern1 {
    public static void StarRightTriangle(int n)
    {
        int a, b;
        for (a = 0; a < n; a++) 
        {
            for (b = 0; b <= a; b++) 
            {
                System.out.print("* ");
            }
            System.out.println(); //end line
        }
    }
 
    // Driver Function
    public static void main(String args[])
    {
        int k;
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
        sc.close();
        StarRightTriangle(k);
    }
}