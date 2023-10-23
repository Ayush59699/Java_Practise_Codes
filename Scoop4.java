class Subject
{
    private String subID;
    private String name;
    private int maxMarks;
    private int markObt;

    public Subject(String subID,String name,int maxMarks)
    {
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;

    }
    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarObt(){return markObt;}

    public void setMaxMarks(int m){maxMarks=m;}
    public void setMarkObt(int m){markObt=m;}
    boolean isQualified(int m){return m>=maxMarks/10*4;}
    public String toString(){return "Sub ID: "+subID+" Name: "+name+"Marks Obt: "+markObt;}


}

class Student
{
    private int rollno;
    private String name;
    private String dept;
    private String subjects;

    public int getRoll(){return rollno;}
    public String getName(){return name;}
    public String getDept(){return dept;}
    public String getSubs(){return subjects;}

    public void setSubs(String m){subjects=m;}

    public Student(int rollno,String name,String dept)
    {
        this.rollno=rollno;
        this.name=name;
        this.dept=dept;
    }
    public String toString()
    {
        return ("RollNO: "+rollno+"Name: "+name+"Deprt: "+dept+"subjects: "+getSubs());
    }
}
public class Scoop4
{
    public static void main(String args[])
    {
        Subject s[]=new Subject[3];
        s[0]=new Subject("s101","DS",100); //arrays of objects
        s[1]=new Subject("s102","Algos",100);//array stores reference of object
        s[2]=new Subject("s103","Oper Sys",100);

        for(Subject a:s)
        {
            System.out.println(a);
        }

        Student b[]=new Student[3];
        b[0]=new Student(101,"Ayush","DSci");
        b[1]=new Student(102,"Rajan","CSE");
        b[2]=new Student(103,"Mahima","LAW");
        for(Student i:b)
        {
            System.out.println(i);
        }

    }
}