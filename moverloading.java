class calculator{
    public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public double add(double n1,int n2)
    {
        return n1+n2;
    }
    public long add(long n1,int n2)
    {
        return n1+n2;
    }
}


public class moverloading {
    public static void main(String[] args) {
        calculator obj=new calculator();
        int result=obj.add(10, 4);
        System.out.println(result);
    }
}
