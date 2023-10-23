/*import java.util.*;
class Shop
{
    private String name;
    private int nsold;
    public Shop(String s,int ns)
    {
        this.name=s;
        this.nsold=ns;
    }
    public String getName(){
        return name;
    }
    public int getItemSold()
    {
        return sold;
    }
}
public class Maptest
{
    public static void printShopName(ArrayList<Shop>sList)
    {
        Map<String,Integer>m=new LinkedHashMap<String,Integer>();
        String shop="";
        int sold=0;
    }
}














*/







/*class ContactEmployee extends Employee{
    final private static double hourlyPay=100;
    private int contactHour;
    double salary;
    public ContactEmployee(String name,long adhar,int contactHour)
    {
        super(name,adhar,contactHour*hourlyPay);
        this.contactHour=contactHour;
    }
    public void print()
    {
        super.print();
    }   
}
*/


/*import java.util.*;
 class Calculator
 {
    public void sum(double a, double b)
    {
        System.out.println(a+b);
    }
    public void subtraction(double a,double b)
    {
        System.out.println(a-b);
    }
    public void multiply(double a,double b)
    {
        System.out.println(a*b);
    }
    public void division(double a,double b)
    {
        System.out.println(a/b);
    }
 }
class Updated calculator extends Calculator
{
    public void remainder(double a,double b)
    {
        System.out.println(a%b);
    }
}
public class CalculatorCheck
{
    public static void main(STring args[])
    {
        Scanner sc = new Scanner(System.in);
        double n1=sc.nextDouble();
        double n2=sc.nextDouble();
        Calculator c=new Calculator();
        c.sum(n1,n2);
        UpdatedCalculator uc=new UpdatedCalculator();
        uc.remainder(n1,n2);
    }
}
*/























/*import java.util.*;
class Employee
{
    String eid;
    String ename;
    String eprojects[];

    public Employee(String id,String name,String[] project)
    {
        this.eid=id;
        this.ename=name;
        this.eprojects=project;
    }
    public Employee(Employee e)
    {
        this.eid=e.eid;
        this.ename=e.ename;
        this.eprojects=e.eprojects;
    }
    public void display()
    {
        System.out.println(eid);
        System.out.println(ename);
        System.out.println("projects :");
        eprojects[0]="P001";
        for(int i=0;i<eprojects.length;i++)
        {
            System.out.println(eprojects[i]+":");
        }
    }
    public void mutator()
    {
        this.ename="Mr"+this,ename;
        this.eprojects[0]=null;
    }
}
public class Fclass{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        String project[]={"p001","p002""p003"};
        String id=sc.nextLine();
        String name=sc.nextLine();
        Employee e1=new Employee(id,name,project);
        Employee e1=new Employee(e1);
        e1.mutator();
        e2.display();
    }
}

import java.util.*;class Employee{
    String ename;
    String eid;
    String edept;
    public Employee()
    {
        ename="guest";
    }
    public Employee(String name,String dept,String id)
    {
        this.ename=name;
        this.edept=dept;
        this.eid=id;
    }
    public void copyDept(Employee e)
    {
        this.edept=e.edept;
    }
    public void displayDetails()
    {
        System.out.println(ename);
        System.out.println(eid);
        System.out.println(edept);
    }
}
public class Fclass{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Employee e1=new Employee();
        String name=sc.nextLine();
        String id=sc.nextLine();
        Employee e2=new Employee();
        e1.copyDept(e2);
        e1.displayDetails();
    }
}

import java.util.*;
public class SeriesSum{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                sum+=Math.pow(j,2);
            }
        }
        System.out.println(sum);
    }
}




/*import java.util.*;
class Fclass{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        evenDisplay(s1);
    }
    public static void evenDisplay(String s)
    {
        int l=s.length();
        for(int i=0;i<l;i+=2)
        {
            System.out.println(s.charAt(i)); //////////////
        }
    }
}
*/


/*import java.util.*;
class Rectangle
{
    int w;
    int h;
    public void setw(int a)
    {
        w=a;
    }
    public void seth(int b)
    {
        h=b;
    }
    public int area()
    {
        int a=w*h;
        return(a);
    }
}
public class revision1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int w=Integer.parseint(sc.nextLine());
        int h=Integer.parseInt(sc.nextLine());
        Rectangle r=new Rectangle();
        r.setw(w);
        r.seth(h);
        int area=r.area();
        System.out.println(area);
    }
}
*/