class mobile {

    String company;
    int price;
    static String model;

    public void show()
    {
        System.out.println(company+": "+price+" :"+model);
    }

    public static void show1(mobile obj)
    {
        System.out.println(obj.company+": "+obj.price+" :"+model); // if we use the static method then we can fristly create class object inside the method and assign to the variables
    }
}


public class Static_method {
    public static void main(String[] args) {
        mobile obj1=new mobile();
        obj1.company="Apple";
        obj1.price=1500;
        mobile.model="iphone16";

        mobile obj2=new mobile();
        obj2.company="Vivo";
        obj2.price=1300;
        mobile.model="Y20";

        mobile.model="A83";

        obj1.show();
        obj2.show(); // only the show method disply 

        mobile.show1(obj1);
        mobile.show1(obj2); //show the static method 

    }
}
