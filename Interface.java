import java.util.Scanner;

interface Car {
    int number = 15;    // variables in interface are static + final
    void drive();
    void run();
}

class B implements Car {
    int age;

    B(int age) {
        this.age = age;
    }

    public void drive() {
        if (age >= 18) {
            System.out.println("You drive car");
        } else {
            System.out.println("You are not drive car");
        }
    }

    public void run() {
        if (age == 18) {
            System.out.println("You drive fast");
        } else if (age > 18 && age <= 25) {
            System.out.println("You take 5th gear");
        } else if (age > 25 && age <= 40) {
            System.out.println("Car in 4th gear");
        } else {
            System.out.println("Car speed not defined for this age");
        }
    }
}

public class Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        Car obj = new B(age);
        obj.drive();
        obj.run();
    }
}
