abstract class A{
    public void show()
    {
        System.out.println("Hello A");
    }
}

public class AbAnIn {
    public static void main(String[] args) {
        
        A obj=new A() {
            public void show()
            {
                System.out.println("hello new show");
            }
        };
        obj.show();
    }
    
}
