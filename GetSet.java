class Human {
    private String name;
    private int age;  // we use private keyword in encapsulation for privacy //private variable only accessed by in the same class

    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;    // this keyword is used to represest the current object.
    }
    public int getAge() 
    {
        return age;
    }
    public void setAge(int age) 
    {
        this.age = age;
    }

   
    
}

public class GetSet {
    public static void main(String[] args) {

        Human obj=new Human();
        obj.setName("Prathamesh Tambekar");  //set value using setter methods
        obj.setAge(22);

        System.out.println(obj.getName()+" :"+obj.getAge());  // Disply values using getter methods
        
    }
}
