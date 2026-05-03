package LeetCode;

//796. Rotate String

public class RotateString {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde" , "cdeab"));
    }
    static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            // rotate string
            s = s.substring(1) + s.charAt(0);

            if (s.equals(goal)) {
                return true;
            }
        }
        return false;
    }
}
