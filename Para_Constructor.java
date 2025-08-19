class Human{

    private int age;
    private String name;

    public Human()                       // Default Constructor
    {
        age=12;
        name="prathamesh";
    }
    public Human(int age, String name )  //parameteried cpnstructor
    {
        this.age=age;
        this.name=name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}

public class Para_Constructor {
    public static void main(String args[])
    {
        Human obj =new Human();
        Human obj1=new Human(18,"Tambekar");

        // obj.setName("sumit");            //if the set method is used then this value are print at the place of default value .
        // obj.setAge(16);

        System.out.println(obj.getName()+" : "+obj.getAge());   //print default constructor value
        System.out.println(obj1.getName()+" : "+obj1.getAge()); // print parameterizd constructor value
    }
    }
    
