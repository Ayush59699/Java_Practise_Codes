public class PascalTrianglePattern 
{
    public int factorial(int a)
    {
        if (a == 0)
            return 1;
        return a * factorial(a - 1);
    }
    public static void main(String[] args)
    {
        int k = 6
        ;
        int a, b;
        PascalTrianglePattern ptp = new PascalTrianglePattern();

        for (a = 0; a <= k; a++) 
        {
            for (b = 0; b <= k - a; b++) 
            {
                System.out.print(" ");
            }
            for (b = 0; b <= a; b++) 
            {
                // nCr formula
                System.out.print(
                    " "
                    + ptp.factorial(a)
                          / (ptp.factorial(a - b)
                             * ptp.factorial(b)));
            }
            System.out.println();
        }
    }
}