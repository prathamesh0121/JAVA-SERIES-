class mobile
{
    public void photo()
    {
        System.out.println("take photo..");
    }

    public String getpen(int count)
    {
        if (count>=10) 
        {
           return "pen";
        }
        else
        return "amount is low";
    }
}

public class method {
    public static void main(String[] args)
    {
        mobile obj=new mobile();
        obj.photo();
        String s=obj.getpen(8);
        System.out.println(s);
        
    }
}
