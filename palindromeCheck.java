import java.util.Scanner;
public class palindromeCheck
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            String str=sc.nextLine();
            int length=str.length();
            boolean isPalindrome=true;
            for(int i=0;i<length;i++)
            {
                if(str.charAt(i)!=str.charAt(length-1-i))
                {
                    System.out.println("Not Palindrome");
                    isPalindrome=false;
                    break;
                }
            }
   
            if(isPalindrome)
            {
                System.out.println("Palindrome yes");
            }
        }
    }
}

