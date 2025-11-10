class Car
{
    String model;
    int price;

    public String toString()
    {
    
       return model+":"+price;
    }
}
public class ETH {
    public static void main(String[] args) {

        Car obj = new Car();
        obj.model="BMW";
        obj.price=1000;

        Car obj1= new Car();
        obj1.model="odi";
        obj1.price=2000;

        obj.toString();
        obj1.toString();

        System.out.println(obj+"\n"+obj1);   //print string 

        boolean result=obj.equals(obj1);    //comapre equals methods
        System.out.println(result);


        System.out.println(obj.hashCode()+"\n"+obj1.hashCode());  //use hashcode 

        
    }
    
}
