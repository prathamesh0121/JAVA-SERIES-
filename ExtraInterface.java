interface Y 
{
    public void show();
    public void config();
    
}
interface X 
{
    public void run();    
}
interface Z extends Y
{
   public void stop();
}

class A implements X
{
    public void run()
    {
        System.out.println("Running");
    }
}
class B implements Z
{
    public void show()
    {
        System.out.println("hello b");
    }
    public void config()
    {
        System.out.println("hello config");
    }
    public void stop()
    {
        System.out.println("stop");
    }
}


public class ExtraInterface {
    public static void main(String[] args) {

        Z obj =new B();
        obj.show();
        obj.config();
        obj.stop();

        X obj1=new A();
        obj1.run();


        
    }
    
}
