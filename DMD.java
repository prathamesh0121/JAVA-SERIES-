class A
{
    public void show()
    {
        System.out.println("Show A");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("show B");
    }
}

public class DMD {
    public static void main(String[] args) {

        A obj =new A();
        obj.show();

        obj = new B();     // Daynamic Method Dispatch
        obj.show();
        
    }
    
}
