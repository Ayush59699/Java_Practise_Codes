 class Faculty
{
    private String name;
    private String dept;

    public String getName()
    {
        return name;
    }
    public Faculty(String name,String dept)
    {
        this.name=name;
        this.dept=dept;
    }
    public String getDept()
    {
        return dept;
    }
    public String toString()
    {
        return "Faculty [name= "+name+", dept="+dept+"]";
    }
}
 class Hod extends Faculty
{
    public Hod(String name,String dept)
    {
        super(name,dept);
    }
    public String toString()
    {
        return "Hod [name= "+getName()+", dept="+getDept()+"]";
    }
}
public class CopyArrayObjects
{
    public static <S extends T,T> void copy(S[] src,T[] tgt)
    {
        int i,limit;
        limit=Math.min(src.length,tgt.length);
        for(i=0;i<limit;i++)
        {
            tgt[i]=src[i];
        }
    }

    public static void main(String args[])
    {
        Hod hod1=new Hod("johnny","cse");
        Hod hod2=new Hod("ayush","cse");
        Hod hod3=new Hod("rajan","cse");
        Hod hod[]={hod1,hod2,hod3};
        Faculty[] members=new Faculty[2];
        CopyArrayObjects.copy(hod,members);
        for(int i=0;i<members.length;i++)
        {System.out.println(members[i]);}
    }
}

