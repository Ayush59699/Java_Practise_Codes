
class Student111
{
    private String rollno;
    private static int count=1;
    private String assignRollNo()
    {
        String rno="Univ-"+"2022"+"-"+count;
        count++;
        return rno;
    }
    Student111()
    {
        rollno=assignRollNo();
    }
    public String getRollNo()
    {
        return rollno;
    }
}
public class Tutorial12
{
    public static void main(String args[])
    {
        Student111 s1=new Student111();
        Student111 s2=new Student111();
        Student111 s3=new Student111();

        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());
    }
}