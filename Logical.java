public class Logical {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        int c=7;
        int d=8;

        boolean r1=a<b && c<d;
        boolean r2=a>b &&c>d;

        boolean r3=a<b || c<d;
        boolean r4=a>b ||c<d;

        boolean r5 =a<c;

        System.out.println("r1="+r1+", r2="+r2+", r3="+r3+", r4="+r4);

        System.out.println(!r5);// ! is convert true value into false 
    }
}
