abstract class TV
{
    public void switchON(){System.out.println("TV is ON");}
    public void changeChannel(){System.out.println("TV channel changed");}

}
class smartTV extends TV
{
    public void switchON(){System.out.println("SmartTV is ON");}
    @Override
    public void changeChannel(){System.out.println("SmartTV channel changed");}
    // additional method
    public void browse(){System.out.println("SmartTV is Browsing");}
}
public class Overriding1
{
    public static void main(String args[]) 
    {
        //smartTV t= new smartTV();
        TV t= new smartTV();
        t.switchON();
        t.changeChannel();
        //t.browse();
    }
}