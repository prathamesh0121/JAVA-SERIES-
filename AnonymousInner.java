class A{
    public void show()
    {
        System.out.println("in a show");
    }
}
public class AnonymousInner {
    public static void main(String[] args) {
        A obj =new A()
        {
            public void show()
            {
                System.out.println("in new show");
            }
        };
        obj.show();
       
    }
}
