public class do_while {
    public static void main(String[] args) {
        int i=1;
        do{
        System.out.println("hii "+i);
            int j=1;
            do{
                System.out.println("hello "+j);
                j++;
            }while(j<=3);
        i++;
        }
        while(i<=5);
        System.out.println("bye");
    }
    
}
