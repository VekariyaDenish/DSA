package LeetCode;

//7. Reverse Integer

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(120));
    }
    static int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x = x / 10;

            // Check overflow before multiplying
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = rev * 10 + digit;
        }

        return rev;


//        //THIS ALSO WORK BUT LONG PROCESS
//
//        //Step 1: Handle sign
//        boolean isNegative = false;
//        if (x < 0) {
//            isNegative = true;
//            x = -x;
//        }
//
//        int result = 0;
//
//        // Step 2: Extract digits one by one
//        while (x > 0) {
//            int digit = x % 10;   // get last digit
//            x = x / 10;           // remove last digit
//
//            // Step 3: Check overflow BEFORE adding digit
//            if (result > Integer.MAX_VALUE / 10) {
//                return 0;
//            }
//
//            // Step 4: Build reversed number
//            result = result * 10 + digit;
//        }
//
//        // Step 5: Restore sign
//        if (isNegative) {
//            result = -result;
//        }
//
//        return result;
    }
}
