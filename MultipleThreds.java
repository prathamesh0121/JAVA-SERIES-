class Car extends Thread
{
    public void run() 
    {
        for(int i=1;i<=10;i++)
        {
             System.out.println("Fortuner");
        }
       
    }
}  

class Truck extends Thread
{
    public void run()
    {
       for(int i=1;i<=10;i++)
       {
             System.out.println("Tata Mahendra");
       }
    }
}
public class MultipleThreds {
    public static void main(String[] args) {
        Car obj1 = new Car();
        Truck obj2 = new Truck();

        obj1.start();
        obj2.start();
    }
    
}
    

