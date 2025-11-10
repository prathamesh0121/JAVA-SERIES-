import java.util.Scanner;

class Addition
{
    public boolean checkprime(int n)
    {
        if (n<=1) return false;
        if (n%2==0) return false;
        if (n==2) return true;

        for(int i=3; i<=Math.sqrt(n);i+=2)
        {
            if (n%i==0) {
                return false;
            }

        }
        return true;
    
    }
        public int largesmallnumber(int start,int end)
        {
            int small=-1,large=-1;

            for(int i=start ;i<=end;i++)
            {
                if (checkprime(i)) {
                    small=i;
                    break;

                }
            }
            for(int i=end ;i>=start;i--)
            {
                if (checkprime(i)) {
                    large=i;
                    break;
                }
            }

            if (small==-1 ||large ==-1) {
                return -1;
                
            }
            return small+large;
        }

        
}
public class PrimeNumAdd 
{
    public static void main(String[] args) {
        {
       Addition obj=new Addition();

//     int start=10,end=100;    //given the direct range

       while(true)
       {
         Scanner scanner=new Scanner(System.in);   //take a user input range
        System.out.println("Enter the start number :");
        int start=scanner.nextInt();


        Scanner scanner1=new Scanner(System.in);
        System.out.println("Enter the End number :");
        int end=scanner1.nextInt();

        int result=obj.largesmallnumber(start,end);

        if (result==-1)
        {
            System.out.println("no prime number in given range");
        }
        else {
            System.out.println("Addition of Small and Large Prime number is :" + result);
        }

    }
    }
    
    }
}