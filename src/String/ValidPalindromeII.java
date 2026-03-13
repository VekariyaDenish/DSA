package String;

//680. Valid Palindrome II

public class ValidPalindromeII {
    public static void main(String[] args) {

        System.out.println(validPalindrome("abc"));

    }
    static boolean validPalindrome(String s) {

        return Afterdelete(s);

    }

    static boolean Afterdelete(String s){
        int left = 0;
        int right = s.length()-1;

        while (left< right){
            if(s.charAt(left)!=s.charAt(right)){
                return check(s,left+1 ,right) || check(s,left , right - 1);
            }
            left ++;
            right --;
        }
        return true;

    }
    static boolean check(String s , int left , int right){

        while (left< right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}
