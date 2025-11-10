class A{
    public A()
    {
        super();
        System.out.println("Hiiii A");
    }
    public A(int n)
    {
        super();
        System.out.println("Hiiii A new");
    }
    public void show() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'show'");
    }
}

class B extends A{
    public B()
    {
        super();
        System.out.println("hiiii B");
    }
    public B(int n)
    {
        // this();      //if we use this() then show the same class constructor as well as parent class default constructor
        //super();      // disply default parent constructor and parameterized constructor
        super(n);       //if parameter pass the show the both parametrized constructor value.
        System.out.println("Hiiii B new");
    }

}
public class superThis {
    public static void main(String[] args) {

        B obj=new B(5);
        
    }
}
