package LeetCode;

//1221. Split a String in Balanced Strings

public class SplitaStringinBalancedStrings {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
    }
    static int balancedStringSplit(String s) {
        int balance = 0;
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == 'R') {
                balance++;
            } else {
                balance--;
            }

            if (balance == 0) {
                count++;
            }
        }

        return count;
    }
}
