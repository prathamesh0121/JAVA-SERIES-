enum Laptop{
    Asus(200),Dell(250),Mackbook(300),HP(150);

    private int price;

    private Laptop()
    {
        
    }
    private Laptop(int price)
    {
        this.price=price;
    }

    public int getPrice() 
    {
        return price;
    }
    public void setPrice(int price) 
    {
        this.price = price;
    }

    
    

}

public class EnumClass {
    public static void main(String[] args) {

        // Laptop lap=Laptop.Asus;
        // System.out.println(lap);
   
        for(Laptop laps:Laptop.values())
        {
            System.out.println(laps +": "+laps.getPrice());
        }
    }
}
