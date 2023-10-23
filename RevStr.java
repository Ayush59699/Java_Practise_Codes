//Reversea string
public class RevStr
{
    public static void main(String args[])
    {
        String word="Ayush Singh";
        String reverse=new StringBuffer(word).reverse().toString();
        word="LOVELY PEOPLE";
        reverse=new StringBuilder(word).reverse().toString();
        System.out.println(reverse);
    }
    public static String reverse(String source)
    {
        if(source==null || source.isEmpty())
        {
            return source;
        }
        String reverse="";
        for(int i=source.length()-1;i>=0;i--)
        {
            reverse=reverse+source.charAt(i);
        }
        return reverse;
    }
}