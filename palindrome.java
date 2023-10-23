import java.util.Scanner;
public class palindrome
{
	public static void main(String args[])
	{
		int rev=0;
		int org, a;
		System.out.println("Enter an Integer");
		Scanner sc=new Scanner(System.in);
		org=sc.nextInt();
		sc.close();
		while(org>=0)
		{
			a=org%10;
			rev=rev*10+a;
			org=org/10;
		}
		if(org==rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
	
}

		