class Calculator
{
    public int add(int a,int b)
    {
        return a+b;
    }
}
class AdvCalculator extends Calculator
{
    public int add(int a ,int b)
    {
        return a+b+(a-b);       //method overriding take the features of super class and add their own features
    }
}

public class Overriding {
    public static void main(String[] args) {
        AdvCalculator obj=new AdvCalculator();
        int r=obj.add(4, 5);
        System.out.println(r);
    }
    
}
