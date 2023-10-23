

/*class Person
{
    private String name;
    private long adhar;
    public Person(String name,long adhar)
    {
        this.name=name;
        this.adhar=adhar;
    }
    public void print()
    {
        System.out.println("Name: "+name);
        System.out.println("Adhar no: "+adhar);

    }
}
class Employee extends Person
{
    public double salary;
    public Employee(String name,long adhar,double salary)
    {
        super(name,adhar);
        this.salary=salary;
    }
    public void print()
    {
        super.print();
        System.out.println("Salary"+salary);
    }
}
class ContactEmployee extends Employee
{
    final private static double hourlyPay=100.00;
    private int contactHour;
    public ContactEmployee(String name,long adhar,int contactHour)
    {
        super(name,adhar,contactHour*hourlyPay);
        this.contactHour=contactHour;
    }
}
public class test2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nm1 = sc.nextLine();
        String nm2 = sc.nextLine();
        long adh1 = sc.nextLong();
        long adh2 = sc.nextLong();
        double sal = sc.nextDouble();
        int cont = sc.nextInt();
        Employee[] eArr = new Employee[2];
        eArr[0] = new Employee(nm1, adh1, sal);
        eArr[1] = new ContactEmployee(nm2, adh2, cont);
        sc.close();
        for(Employee e : eArr)
            e.print();
    }
}
*/