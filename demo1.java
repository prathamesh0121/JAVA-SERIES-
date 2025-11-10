import java.util.Scanner;

class addition
{
    public boolean checkPrime(int n)   // check the prime number
    {
        if(n<=1) return false;
        if(n==2) return  true;
        if(n%2==0) return  false;

        for (int i=3 ; i<=Math.sqrt(n); i+=2)
        {
            if(n%i==0) return false;
        }
        return true;
    }

    public int sum(int start, int end)
    {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (checkPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
}

public class demo1 {
    public static void main(String args[])
    {
        addition obj = new addition();

        Scanner scanner = new Scanner(System.in);   //take a user input range
        System.out.println("Enter the start number :");
        int start = scanner.nextInt();

        System.out.println("Enter the End number :");
        int end = scanner.nextInt();

        int result = obj.sum(start, end);
        System.out.println("Sum of prime numbers between " + start + " and " + end + " is: " + result);

        scanner.close();
    }
}