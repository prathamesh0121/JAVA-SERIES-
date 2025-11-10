import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        } else
            return -1;
        
    }

}

public class ComparableCollection {
    public static void main(String[] args) {
        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                if (i.age > j.age) {
                    return 1;
                } else
                    return -1;
            }
        };

        List<Student> nums = new ArrayList<>();
        nums.add(new Student(24, "ABC"));
        nums.add(new Student(32, "PQR"));
        nums.add(new Student(23, "SDF"));
        nums.add(new Student(12, "MNO"));
        nums.add(new Student(16, "GHJ"));

        Collections.sort(nums);

        for (Student s : nums) {
            System.out.println(s);
        }

    }
}
