class A{
    public void showTheContentsInClass()
    {
        System.out.println("hello class A");
        
    }
}
class B extends A{
    @Override                 //Annotaion which help to find the error before compiled time
                              //it helps to avoid the logical error in the program because logical error is more difficult to find when you use annotation it helps to find the logical error

    public void showTheContentsInClass()
    {
        System.out.println("Hello class B");
    }
}

public class Annotation {
    public static void main(String[] args) {
        B obj =new B();
        obj.showTheContentsInClass();
    }
    
}
