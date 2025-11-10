import java.util.Map;
import java.util.HashMap;
public class HashMapCollection {
    public static void main(String[] args) {
        
        Map<String,Integer> students = new HashMap<>();

        students.put("asdf", 98);
        students.put("abcd", 95);
        students.put("qwer", 92);
        students.put("mnbv", 88);
        students.put("lkjh", 89);

        System.out.println(students);       //print all value without ARRANGEMNT

        System.out.println(students.get("asdf")); // print only the asdf value

        for(String key : students.keySet())      // print all key and value with proper arragnemnt
        {
            System.out.println(key +" "+students.get(key));
        }
    }
}
