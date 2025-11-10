class Calculator
{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int sub(int a , int b)
    {
        return a-b;
    }
}

public class Inheritance {
    public static void main(String[] args) {

        // AdvCalculator obj =new AdvCalculator();   //create object of subclas 
        // int r1=obj.add(10, 20);
        // int r2=obj.sub(20, 10);
        // int r3=obj.mul(10, 2);
        // int r4=obj.div(20, 10);

        // System.out.println("Add :"+r1+"\n"+"Sub :"+r2+"\n"+"Mul :"+r3+"\n"+"Div :"+r4);


        VeryAdvCalculator obj =new VeryAdvCalculator();   //multi level intertance use and the create object of vertAdvCalculator class.
        int r1=obj.add(10, 20);
        int r2=obj.sub(20, 10);
        int r3=obj.mul(10, 2);
        int r4=obj.div(20, 10);
        int r5=obj.Power(20, 10);
        int r6=obj.percentage(10, 2);
        int r7=obj.squre(10);

        System.out.println("Add :"+r1+"\n"+"Sub :"+r2+"\n"+"Mul :"+r3+"\n"+"Div :"+r4+"\n"+"Power :"+r5+"\n"+"Percentage :"+r6+"\n"+"Square :"+r7);
        
    }
}
