class calculator
{
    int num=5;         //instance variable

    public int add(int n1,int n2)  //local variable
    {
        System.out.println("local num is ="+num);
        return n1+n2;
    }
}

public class stack_heap {
    public static void main(String[] args) {
        calculator obj=new calculator();
        calculator obj1=new calculator();
        int result =obj.add(4, 3);
        System.out.println("Result is ="+result);
        obj.num=8;

        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}
