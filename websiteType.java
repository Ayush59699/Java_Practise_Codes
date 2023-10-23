import java.util.Scanner;

public class websiteType 
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Website URL");
			String url=sc.nextLine();
			String protocol=url.substring(0,url.indexOf(":"));
			if(protocol.equals("http"))
			    System.out.println("Hyper text transfer protocol");
			else if(protocol.equals("ftp"))
			    System.out.println("File transfer protocol");
			
			String ext=url.substring(url.lastIndexOf("."));
			if(ext.equals("com"))
			    System.out.println("Commercial");
			else if(ext.equals("org"))
			    System.out.println("Organisation");
			else if(ext.equals("net"))
			    System.out.println("Network");
		}
             
    }
}
