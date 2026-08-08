package LeetCode;

//3456. Find Special Substring of Length K

public class FindSpecialSubstringofLengthK {
    public static void main(String[] args) {

        System.out.println(hasSpecialSubstring("dii",1));

    }
    static boolean hasSpecialSubstring(String s, int k) {
        if(s.length() == 1 && k == 1) return true;

        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {

                // Current group ended
                if (count == k) {
                    return true;
                }

                count = 1;
            }
        }

        return count == k;
    }
}
