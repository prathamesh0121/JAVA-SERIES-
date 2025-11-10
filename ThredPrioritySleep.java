class A extends Thread
{
    public void run(){
        
        for(int i=0; i<=10; i++)
        {
            System.out.println("hiii");
           try {
                Thread.sleep(10);
           } catch (Exception e) {e.printStackTrace(); }
        }
    }
}

class B extends Thread{
    public void run(){
        
        for(int i=0; i<=10; i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (Exception e) {e.printStackTrace(); }
        }
    }
}
public class ThredPrioritySleep {
    public static void main(String[] args) {
        
        A obj = new A();
        B obj1 = new B();
       // System.out.println(obj.getPriority());  // by defalut 5 priority
       // obj1.setPriority(Thread.MAX_PRIORITY);  // set the priority or direct we give value in this brackets
       
       obj.start();

       try {
         Thread.sleep(5);       // this try catch block stop the excuation betwwen obj and obj1 for feww times for proper working
       } catch (Exception e) {
        e.printStackTrace();
       }

        obj1.start();
    }
}