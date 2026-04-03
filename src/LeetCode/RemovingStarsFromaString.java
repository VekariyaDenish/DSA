package LeetCode;

//2390. Removing Stars From a String
public class RemovingStarsFromaString {
    public static void main(String[] args) {
        System.out.println(removeStars("leet**co*de"));
    }
    static String removeStars(String s) {
        StringBuilder result = new StringBuilder();
        int skip = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '*') {
                skip++;
            } else {
                if (skip > 0) {
                    skip--; // remove this character
                } else {
                    result.append(c);
                }
            }
        }
        return result.reverse().toString();
    }
}
