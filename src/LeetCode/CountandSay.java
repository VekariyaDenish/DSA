package LeetCode;

//38. Count and Say

public class CountandSay {
    public static void main(String[] args) {

        System.out.println(countAndSay(1));

    }
    static String countAndSay(int n) {

        String s = "1";

        for (int k = 1; k < n; k++) {

            StringBuilder ans = new StringBuilder();

            int count = 1;

            for (int i = 0; i < s.length(); i++) {

                if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                    count++;
                } else {
                    ans.append(count);
                    ans.append(s.charAt(i));
                    count = 1;
                }
            }

            s = ans.toString();
        }

        return s;
    }
}
