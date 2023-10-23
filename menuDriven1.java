import java.util.*;
public class menuDriven1 
{
    public static void main(String args[])
    {
        //MAKE A MENU DRIVEN PROGRAM FOR ARITHMETIC OPERATIONS
        Scanner sc=new Scanner(System.in); 
        System.out.println("MENU :");
        System.out.println("==== :");
        System.out.println("ADD :");
        System.out.println("SUB :");
        System.out.println("MUL :");
        System.out.println("DIV :");
        // enter 2 numbers in single line
        System.out.println("first number");

        int x=sc.nextInt();
        System.out.println("second number");
        int y=sc.nextInt();
        System.out.println("option dalo");
        String option=sc.next();
        System.out.println(option);
        option=option.toUpperCase();
        
        sc.close();
        switch(option)
        {
            case "ADD": System.out.println("Sum is :"+(x+y));
                        break;
            case "SUB": System.out.println("Subtraction is :"+(x-y));
                        break;
            case "MUL": System.out.println("Product is :"+(x*y));
                        break;
            case "DIV": System.out.println("Division is :"+(x/y));
                        break;
            default :   System.out.println("Invalid");

        }
    }
}
