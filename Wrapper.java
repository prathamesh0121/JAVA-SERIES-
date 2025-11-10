public class Wrapper {
    public static void main(String[] args) {
        
        int num=7;
        
        Integer num1 = num;

        int num2=num1;

        System.out.println("num1 :"+num1);

        System.out.println("num2 :"+num2);

        String str ="12";
        int num3=Integer.parseInt(str);
        System.out.println("String :"+num3);
    }
}
