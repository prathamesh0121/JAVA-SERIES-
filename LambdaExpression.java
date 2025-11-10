interface A{
    void show(int i);
}
public class LambdaExpression {
    public static void main(String[] args) {
        
        A obj = i-> System.out.println("in show "+i);    //Lambda expression perform and reduce the code
        
        obj.show(5);
    }

    
}
