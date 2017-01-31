package com.hackerrank.test.tutorial;

/**
 * Created by txcakaloglu on 1/31/17.
 */
public class _Bitwise_HackerRank_Tutorial {

    /*
   & : BITWISE AND     1 (true) if both operands are true, otherwise 0 (false)
   ----------------
     1 & 1 = 1
     1 & 0 = 0
     0 & 1 = 0
     0 & 0 = 0

    | : BITWISE INCLUSIVE OR    1 if either operand is true, otherwise 0 (false) if both operands are false. In other words:
   ---------------------------
     1 | 1 = 1
     1 | 0 = 1
     0 | 1 = 1
     0 | 0 = 0

    ^ : BITWISE EXCLUSIVE OR // XOR   1 (true) if and only if exactly one of the two operands is 1 ; if both operands are 1 or 0, it evaluates to 0 (false). In other words:
   ---------------------------
     1 ^ 1 = 0
     1 ^ 0 = 1
     0 ^ 1 = 1
     0 ^ 0 = 0

    ~ : BITWISE COMPLEMENT , the bitwise-inverted 8-bit binary number 01111001 becomes 10000110, and the bitwise-inverted signed decimal integer 8 becomes 9.
   ---------------------------
         * */


    //

    // The code below converts a word and an integer to binary strings:
    static class BinaryString {
        BinaryString(String string) {
            System.out.println("Binary of " + string);
            for (byte b : string.getBytes()) {
                System.out.print(Integer.toBinaryString(b) + " ");
            }
            System.out.println();
        }

        BinaryString(Integer integer) {
            System.out.println("Binary of " + integer);
            System.out.println(Integer.toBinaryString(integer));
        }

    }

    // Next, let's modify the above class to find and print the OR of each character in the string with : 8675309

    static class ORBinaryString {
        ORBinaryString(String string, Integer integer) {
            String binaryString = Integer.toBinaryString(integer);
            for (byte b : string.getBytes()) {
                // Perform a bitwise operation using byte and integer operands, save result as tmp:
                int tmp = b | integer;
                System.out.println(Integer.toBinaryString(b) + " OR " + Integer.toBinaryString(integer) + " = " + Integer.toBinaryString(tmp) + " = " + tmp);
            }
        }
    }

    static class XORBinaryString {
        XORBinaryString(String string, Integer integer) {
            String binaryString = Integer.toBinaryString(integer);
            for (byte b : string.getBytes()) {
                // Perform a bitwise operation using byte and integer operands, save result as tmp:
                int tmp = b ^ integer;
                System.out.println(Integer.toBinaryString(b) + " XOR " + Integer.toBinaryString(integer) + " = " + Integer.toBinaryString(tmp) + " = " + tmp);
            }
        }
    }


    public static void main(String[] args) {
        BinaryString binaryString = new BinaryString("HackerRank");
        binaryString = new BinaryString(3);

        ORBinaryString orBinaryString= new ORBinaryString("HackerRank", 3);
        System.out.println();
        /*
        * Notice that the first  bits 17 (1000010001011111111) are always the same.
        * This is because bit position is counted starting with the least-significant (rightmost) bit and then it moves left so,
        * in the example above, the only values with the potential to change are the lower (rightmost) 7 bits
        * (as that is the number of bits in the smaller operand). For each bit position in the lower 7 bits,
        * an OR operation is performed. If we were to again modify the above code to print the exclusive OR (instead of the inclusive OR), we would get this output:
        * */
        System.out.println();
        XORBinaryString xorBinaryString= new XORBinaryString("HackerRank", 3);

    }


}
