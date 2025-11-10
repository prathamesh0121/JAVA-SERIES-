interface Computer
{
    public abstract void code();
}
class dekstop implements Computer
{
    public void code()
    {
        System.out.println("code , complile ,run");
    }
}
class laptop implements Computer
{
    public void code()
    {
       System.out.println("coding");
    }
}

class Developer
{
    public void code(Computer lap)
    {
        lap.code();
    }
    
}

public class NeedInterface {
    
    public static void main(String[] args) {
        
        Computer lap=new laptop();
        Computer desk =new dekstop();

        desk.code();

    }
}
