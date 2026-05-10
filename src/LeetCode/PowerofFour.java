package LeetCode;

//342. Power of Four

public class PowerofFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }
    static boolean isPowerOfFour(int n) {
        if (n <= 0) return false;

        //Simple logic — keep dividing by 4, if we reach 1 → power of 4 (true)

        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }

}
