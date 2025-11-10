class A{
    int num;

    public void show()
    {
        System.out.println("hello");
    }

    class B
    {
        public void config()
        {
            System.out.println("hello prathamesh");
        }
    }
}


public class Inner {

    public static void main(String[] args) {
        
        A obj=new A();
        obj.show();

        A.B obj1=obj.new B();
        obj1.config();
    }
    
}
