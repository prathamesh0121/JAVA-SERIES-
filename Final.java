class Calc
{
    final int a =5;

    public void show()
    {
        System.out.println("in final method A");
    }

    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}

class AdvCalc extends Calc
{
    public void show()
    {
        System.out.println("in method B ");
    }
}


public class Final {
    public static void main(String[] args) {

        AdvCalc obj=new AdvCalc();
        obj.show();
        obj.add(4,6);
        
    }
    
}
