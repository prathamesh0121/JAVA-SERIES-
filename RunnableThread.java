// Using runnable 

// class A implements Runnable
// {
//     public void run(){
        
//         for(int i=0; i<=10; i++)
//         {
//             System.out.println("hiii");
//            try {
//                 Thread.sleep(10);
//            } catch (Exception e) {e.printStackTrace(); }
//         }
//     }
// }

// class B implements Runnable{
//     public void run(){
        
//         for(int i=0; i<=10; i++)
//         {
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(10);
//             } catch (Exception e) {e.printStackTrace(); }
//         }
//     }
// }

// public class RunnableThread {
//     public static void main(String[] args) {
//         Runnable runnable = new A();
//         Runnable runnable2= new B();
      
//         Thread t1 = new Thread(runnable);
//         Thread t2= new Thread(runnable2);

//         t1.start();
//         t2.start();
//     }
    
// }



//using anonymous class 

public class RunnableThread {
    public static void main(String[] args) 
    {
        Runnable runnable = () ->{
        {
            for(int i=0; i<=10; i++)
            {
                System.out.println("hiii");
            try { Thread.sleep(10);} catch (Exception e) {e.printStackTrace(); }
            }
    
        }
        };
        
        Runnable runnable2= ()->{
        
        for(int i=0; i<=10; i++)
            {
                System.out.println("Hello");
                try { Thread.sleep(10); } catch (Exception e) {e.printStackTrace(); }
            }
        };
      
        Thread t1 = new Thread(runnable);
        Thread t2= new Thread(runnable2);

        t1.start();
        t2.start();
    }
    
}
