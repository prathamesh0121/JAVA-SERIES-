public class Stringbuff {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Prathamesh");
        sb.append(" Tambekar");
        System.out.println("Full name :"+sb);
        System.out.println("-------------------------------------");

        System.out.println("capacity :"+sb.capacity());
        System.out.println("-------------------------------------");

        
        System.out.println("Length :"+sb.length());
        System.out.println("-------------------------------------");

         // Keep original before delete
        StringBuffer original = new StringBuffer(sb.toString());
        
        // Delete in sb
        System.out.println("Delete index 2 :"+sb.deleteCharAt(2));
        System.out.println("-------------------------------------");
        
        // Insert in original, not in sb
        System.out.println("Insert Data :"+original.insert(0,"Hello "));
        System.out.println("-------------------------------------");

        
        System.out.println("To String :"+original.toString());
        System.out.println("-------------------------------------");

        System.out.println("SubString :"+original.substring(6,16));
        System.out.println("-------------------------------------");

        System.out.println("Reverse String :"+original.reverse());
        System.out.println("-------------------------------------");

         // Reverse back before replace
        original.reverse();

        System.out.println("Replace:"+original.replace(0,5,"hiii "));
        System.out.println("-------------------------------------");

        System.out.println("Empty:"+original.isEmpty());
        System.out.println("-------------------------------------");
    }
}
