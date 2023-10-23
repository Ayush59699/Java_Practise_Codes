class MyThreads extends Thread
{
    public void run()
    {
    int c=1;
    while(true)
    {
        System.out.println(c++);
    }
    }
}
public class TreadTest2
{
    public static void main(String args[]) throws Exception
    {
        MyThreads t=new MyThreads();
        t.setDaemon(true);
        t.start(); // after this, main() ends, so use Daemon
        try{Thread.sleep(100);} catch(Exception e){}
        // for 100 mili seconds, run() works , then terminates
        Thread mainThread=Thread.currentThread();
        mainThread.join();




    }
}