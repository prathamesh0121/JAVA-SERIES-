class Counter 
{
    int count;
    public synchronized void count()
    {
        count++;
    }
    
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException
    {
        Counter c = new Counter();

        Runnable runnable = () ->{
        {
            for(int i=1; i<=10000; i++)
            {
                c.count();
            }
    
        }
        };
        
        Runnable runnable2= ()->{
        
        for(int i=1; i<=10000; i++)
            {
             c.count();
            }
        };
      
        Thread t1 = new Thread(runnable);
        Thread t2= new Thread(runnable2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
    
}


