class A{

    public A()
    {
        System.out.println("Hiiii A");
    }
    public void show()
    {
        System.out.println("Hello A");
    }
}

public class Anonymous {
    public static void main(String[] args) {
        // A obj=new A();       //Declaring and creting the object in java
        // obj.show();

        new A().show();   //Anonymous object in java
    }
    
}
