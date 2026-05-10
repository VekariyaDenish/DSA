package LeetCode;

//202. Happy Number

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));

    }
    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum += r * r;
            n /= 10;
        }
        return sum;
    }

    static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = digitSum(slow);
            fast = digitSum(digitSum(fast));
        } while (slow != fast);

        return slow == 1;
    }

    //can also solve with recursion --  borrowed from solutions

    static boolean isHappy2(int n) {
        if(n==1 || n==7) return true;

        else if(n<10) return false;

        else{
            int sum=0;
            while(n>0){
                int temp=n%10;
                sum+= temp*temp;
                n=n/10;
            }
            return isHappy(sum);
        }
    }
}
