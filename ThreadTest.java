class Mythread extends Thread
{
    public Mythread(String name)
    {
        super(name);
        setPriority(Thread.MAX_PRIORITY);

    }
    public void run()
    { 
        int count =1;
        while(true)
        {
            System.out.println(count);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            
            count++;
        }
    }
}
public class ThreadTest
{
    public static void main(String args[]) throws Exception
    {
        Mythread t=new Mythread(" My Thread 1");

        System.out.println("ID "+ t.getId());
        System.out.println("name "+t.getName());
        System.out.println("priority "+ t.getPriority());
        t.start();
        System.out.println("state "+ t.getState());
        System.out.println("Alive "+ t.isAlive());
        t.interrupt();
        

    }
}