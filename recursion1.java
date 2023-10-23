public class recursion1
{//print first n naturan numbers
    static void recr(int n)
    {
        if(n>0)
        {
            //recr(n-1);
            System.out.println(n);
            recr(n-1);
        }
    }
    public static void main(String args[])
    {
        recr(3);
    }
}