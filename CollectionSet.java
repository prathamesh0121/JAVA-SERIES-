// TYPE 1

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {
    public static void main(String[] args) {
        
        // Collection<Integer> nums = new HashSet<Integer>(5);   // we use collection except Set

        Set<Integer> nums = new HashSet<Integer>(5);
        nums.add(54);
        nums.add(60);
        nums.add(85);
        nums.add(21);
        nums.add(34);


        for(int n :nums)
        {
            System.out.println(n);
        }
    }
}



// TYPE 2

// import java.util.Collection;
// import java.util.HashSet;
// import java.util.Iterator;
// import java.util.Set;
// import java.util.TreeSet;

// public class CollectionSet {
//     public static void main(String[] args) {

//         Set <Integer> nums = new TreeSet<Integer>();    // TreeSet is used for sort the set properly 
//         nums.add(54);
//         nums.add(60);
//         nums.add(85);
//         nums.add(21);
//         nums.add(34);


//         Iterator <Integer>values =nums.iterator();

//         while (values.hasNext()) 
//             System.out.println(values.next());
        
//     }
// }


