package LeetCode;

//58. Length of Last Word

public class LengthofLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));

    }
    static int lengthOfLastWord(String s) {
        s = s.trim();

        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }
            else if (length > 0) {
                break;
            }
        }

        return length;
    }
}
