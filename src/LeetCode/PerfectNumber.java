package LeetCode;

//507. Perfect Number

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
    }
    static boolean checkPerfectNumber(int num) {

        if (num <= 1) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i < num; i++) {

            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;

    }
}
