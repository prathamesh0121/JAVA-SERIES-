class Vehicle{
    public void show()
    {
        System.out.println("hello vehicle");
    }
}
class Bike extends Vehicle
{
    public void show1()
    {
        System.out.println("hello bike");
    }
}
class Car extends Vehicle
{
    public void show2()
    {
        System.out.println("hello car");
    }
}

public class UpDownCasting {
    public static void main(String[] args) {

        Vehicle obj=(Vehicle)new Bike();
        obj.show();                       //Upcasting

        Vehicle obj1=new Bike();
        ((Bike)obj1).show1();            //Downcasting

        Vehicle obj2=new Car();
        ((Car)obj2).show2();            //Downcasting
        
    }
    
}
