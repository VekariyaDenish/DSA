package LeetCode;

//9. Palindrome Number

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    static boolean isPalindrome(int x) {
        int num = x;
       int ans = 0;
       while (num>0){
           int rem = num%10;
           ans = ans *10 +rem;
           num = num/10;
       }

       return x == ans;

    }
}
