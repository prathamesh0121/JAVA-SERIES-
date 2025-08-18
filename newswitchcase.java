public class newswitchcase {
    public static void main(String[] args) {
        String day="sunday";
        String result="";
        

       /* switch(day)
        {
            case "saturday","sunday"->System.out.println("wake up at 9 am");
            case "monday"->System.out.println("wake up at 6 am");
            default->System.out.println("wake up at 7 am");
        }*/

    
        /*switch(day)  // method 1st
        {
            case "saturday","sunday"->result="wake up at 9 am";
            case "monday"->result="wake up at 6 am";
            default->result="wake up at 7 am";
        };
        System.out.println(result);*/

       /*  result=switch(day)  // method 2nd
        {
            case "saturday","sunday"->"wake up at 9 am";
            case "monday"->"wake up at 6 am";
            default->"wake up at 7 am";
        };
        System.out.println(result);*/

        result=switch(day) 
        {
            case "saturday","sunday":yield "wake up at 9 am";
            case "monday": yield "wake up at 6 am";
            default: yield "wake up at 7 am";
        };
        System.out.println(result);



    }
}
