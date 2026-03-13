package String;

//125. Valid Palindrome
public class ValidPalindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome("OP"));

    }
    static boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();
        String str = "";

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >='a' && ch<='z'){
                str += ch;
            }
        }

        sb.append(str);
        String String1 = sb.toString();
        String String2 = sb.reverse().toString();

        return String1.equals(String2);
    }
}
