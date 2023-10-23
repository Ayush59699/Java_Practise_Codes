import java.util.*;
public class switchCase1
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String site=sc.nextLine();
        String ext=site.substring(site.lastIndexOf(".")+1);
        sc.close();
        switch(ext)
        {
            case "gov" : System.out.println("GOVERNMENT");
                        break;
            case "ent" : System.out.println("ENTERPRISE");
                        break;
            case "org" : System.out.println("ORGANISATION");
                        break;
            case "net" : System.out.println("NETWORK");
                        break;
            case "com" : System.out.println("COMMERCIAL");
                        break;           
            default :  System.out.println("INVALID SITE");
                        break;                     
        }

    }
}