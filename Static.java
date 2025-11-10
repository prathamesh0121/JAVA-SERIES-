class mobile {

    String company;  //instance varibales
    int price;
    static String model; // static varibale

    public void show()
    {
        System.out.println(company+": "+price +": "+model);
    }

    
}

public class Static {
    public static void main(String[] args) {

        mobile obj=new mobile();
        obj.company="Apple";
        obj.price=1500;
        mobile.model="SmartPhone";  //static variable always with the class name eg.class mobile for model variable

        
        mobile obj1=new mobile();
        obj1.company="Vivo";
        obj1.price=1200;
        mobile.model="SmartPhone";

        
        mobile obj2=new mobile();
        obj2.company="Oppo";
        obj2.price=1100;
        mobile.model="SmartPhone";

        mobile.model="Andriod";   //chnage the value off all models at a time using static keyword

       //  System.out.println(obj.company +":" +obj.model+":" +obj.price); //simple direct print

       obj.show();
       obj1.show();;
       obj2.show();

        
    }
}
