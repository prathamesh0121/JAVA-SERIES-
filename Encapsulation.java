class Human {
    private String name;
    private int age;  // we use private keyword in encapsulation for privacy //private variable only accessed by in the same class

    public int getAge()   //use getter and setter methods for privacy purpose
    {
        return age;
    }
    public void setAge(int a)
    {
        age=a;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name =n;
    }
    
}

public class Encapsulation {
    public static void main(String[] args) {

        Human obj=new Human();
        obj.setName("Prathamesh");  //set value using setter methods
        obj.setAge(21);

        System.out.println(obj.getName()+" :"+obj.getAge());  // Disply values using getter methods
        
    }
}
