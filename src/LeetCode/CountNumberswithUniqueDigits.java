package LeetCode;

//357. Count Numbers with Unique Digits

public class CountNumberswithUniqueDigits {
    public static void main(String[] args) {
        System.out.println(countNumbersWithUniqueDigits(5));

    }
    static int countNumbersWithUniqueDigits(int n) {

        if (n == 0) return 1;

        int result = 10; // n=1: 0-9
        int uniqueDigits = 9;
        int availableDigits = 9;

        for (int i = 2; i <= n; i++) {
            uniqueDigits *= availableDigits;
            result += uniqueDigits;
            availableDigits--;
        }

        return result;

        // working approach but high T.C.
//        int count = 0;
//
//        if (n == 0) return 1;
//
//        int limit = (int) Math.pow(10, n);
//
//        for (int i = 0; i < limit; i++) {
//            if (hasUniqueDigits(i)) {
//                count++;
//            }
//        }
//
//        return count;
//    }
//
//    static boolean hasUniqueDigits(int num) {
//        boolean[] seen = new boolean[10];
//
//        while (num > 0) {
//            int digit = num % 10;        // extract last digit
//            if (seen[digit]) return false; // duplicate found!
//            seen[digit] = true;
//            num /= 10;                   // remove last digit
//        }
//        return true;
    }
}
