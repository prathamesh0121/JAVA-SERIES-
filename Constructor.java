class Human
{
    private int age;
    private String name;

    public Human()   // Default Constructor 
    {
        age=12;
        name="Prathamesh";
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


public class Constructor {
    public static void main(String[] args) {

        Human obj=new Human();
        System.out.println(obj.getName()+" : "+obj.getAge());  //access the Default constructor values.
        
    }
    
}
