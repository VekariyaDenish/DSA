package LeetCode;

//231. Power of Two
public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(4);
    }
    static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }
}
