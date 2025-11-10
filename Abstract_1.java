abstract class Car        //abstract class
{
    public abstract void drive(); 
    public abstract void fly();  //Declare abstract mathod using semocolon
    public void playMusic()
    {
        System.out.println("music playinggg");
    }
}
abstract class Alto extends Car
{
    public void drive()
    {
        System.out.println("Drivinggg");
    }
}

class fortuner extends Alto            //Concreate class 
{
    public void fly()
    {
        System.out.println("Flayiinggg");
    }

}

public class Abstract_1 {
    public static void main(String[] args) 
    {

    Car obj=new fortuner();          //Dynamic method Dispatch
    obj.drive();
    obj.playMusic();
    obj.fly();

    } 
}
