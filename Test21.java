/* 
import java.util.*;
class Student
{
    private String name;
    private double marks [];
    public Student(String name ,double[] marks)
    {
        this.name=name;
        this.marks=marks;
    }
    public String getname()
    {
        return (this.name);
    }
    public double findTotal()
    {
        double total=0.0;
        for(double i :this.marks)
        {
            total=total+i;
        }
        return (total);
    }
}
public class Test21
{
    public static String getMax(Student[] student)
    {
        double maxMarks=0.0;
        String maxStud="";
        for(Student i:student)
        {
            double totalMarks=i.findTotal();
            if(totalMarks>maxMarks)
            {
                maxStud=i.getname();
                maxMarks=totalMarks;
            }
        }
        return maxStud;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Student[] arr=new Student[3];
        for(int i=0;i<3;i++)
        {
            String name=sc.next();
            double[] m ={sc.nextDouble(),sc.nextDouble(),sc.nextDouble()};
            arr[i]=new Student(name,m);

        }
        sc.close();
        System.out.println(getMax(arr));

    }

    
}*/
