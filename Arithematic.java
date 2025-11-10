public class Arithematic {
    public static void main(String[] args) {
        int num1=20;
        int num2=10;

        int result=num1+num2;
        int result1=num1-num2;
        int result3=num1*num2;
        int result4=num1/num2;

        //method 1
        /*System.out.println(result);
        System.out.println(result1);
        System.out.println(result3);
        System.out.println(result4);*/

        //method 2 
        System.out.println("R1="+result+",R2="+result1+",R3="+result3+",R4="+result4);


        int n=5;
        int a=n+1;
        System.out.println(a);

        int n1=3;
        n1 +=1;
        System.out.println(n1);

        int n2=6;
        //n2++; //post
        ++n2;   //pre
        System.out.println(n2);

        int n3=10;
        n3--;   //post
        //--n3; //pre
        System.out.println(n3);

        int a1=15;
        int copy;
        copy=++a1;
        System.out.println(copy);

        int ab=10;
        int copy1;
        copy1=ab++;
        System.out.println(copy1);

    
    }

}
