public class Multidiamentional {
    public static void main(String[] args) {
        int nums[][] = new int[3][]; // Jagged array with 3 rows

        // Initialize each row with different sizes
        nums[0] = new int[3]; // 3 elements
        nums[1] = new int[5]; // 5 elements
        nums[2] = new int[4]; // 4 elements

        // New Data Assigned
        nums[0][0] = 11; nums[0][1] = 22; nums[0][2] = 33;
        nums[1][0] = 44; nums[1][1] = 55; nums[1][2] = 66; nums[1][3] = 77; nums[1][4] = 88;
        nums[2][0] = 99; nums[2][1] = 100; nums[2][2] = 111; nums[2][3] = 123;

        // First loop: print each element one by one
        System.out.println("Element-wise printing:");
        for (int i = 0; i < nums.length; i++) 
        {
            for (int j = 0; j < nums[i].length; j++) 
            {
                System.out.println(nums[i][j]);
            }
            System.out.println(); // separate each row
        }

        // Second loop: enhanced for-each loop (row-wise)
        System.out.println("Row-wise printing:");
        for (int n[]: nums) {
            for (int m : n) 
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
