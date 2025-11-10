public class literal {
    public static void main(String[] args) {
        int num =10004;

        int num2 =0b101;
        /*1 × 2²  +  0 × 2¹  +  1 × 2⁰
        = 4 + 0 + 1
        = 5 */

        int num3=0123;
        /*0123 in octal =
        1×8² + 2×8¹ + 3×8⁰
        = 64 + 16 + 3
        = 83 (in decimal) */

        int num4 =0xa;
        /*Decimal :  0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15
            Hex   :  0  1  2  3  4  5  6  7  8  9   A  B  C  D  E  F */

        int num5=0x13B;
         /* = (1 × 16²) + (3 × 16¹) + (11 × 16⁰)
            = (1 × 256) + (3 × 16) + (11 × 1)
            = 256 + 48 + 11
            = 315*/

        

        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
    }
}
