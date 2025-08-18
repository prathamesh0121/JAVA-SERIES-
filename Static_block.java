class mobile{
    String company;
    int price;
    static String model;

    public mobile()
    {
        company="";
        price=1200;
        System.out.println("it is a constructor");

    }

    static{
        model="oppo";
        System.out.println("it is a static block");
    }
}

public class Static_block {
    public static void main(String[] args) throws ClassNotFoundException 
    {
        Class.forName("Mobile");
        // mobile obj1=new mobile();
        // obj1.company="Apple";
        // obj1.price=1500;
        // mobile.model="iphone16";

        // mobile obj2=new mobile();
        // obj2.company="Vivo";
        // obj2.price=1300;
        // mobile.model="Y20";

    }
}
