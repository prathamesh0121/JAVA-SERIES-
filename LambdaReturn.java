interface A {
public int  add(int i,int j);
    
}
public class LambdaReturn {
    public static void main(String[] args) {
        //step 1

        // A obj =new A() {
        //     public int add(int i ,int j)
        //     {
        //         return i+j;
        //     }
        // };

        //step 2
        // A obj =(int i ,int j)->
        // {
        //         return i+j;
        // };

        //step 3
        A obj =(i,j)->i+j;   // reduce the no of line code and the final code is this
           
        
        int result = obj.add(5, 5);
        System.out.println(result);
    }
    
}
