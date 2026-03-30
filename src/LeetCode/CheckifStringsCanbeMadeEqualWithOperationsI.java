package LeetCode;

//2839. Check if Strings Can be Made Equal With Operations I

import java.util.Arrays;

public class CheckifStringsCanbeMadeEqualWithOperationsI {

    public static void main(String[] args) {
        System.out.println(canBeEqual("abcd", "cdab"));

    }
    static boolean canBeEqual(String s1, String s2) {

        char[] even1 = {s1.charAt(0), s1.charAt(2)};
        char[] even2 = {s2.charAt(0), s2.charAt(2)};

        char[] odd1 = {s1.charAt(1), s1.charAt(3)};
        char[] odd2 = {s2.charAt(1), s2.charAt(3)};

        Arrays.sort(even1);   // array can also sort the char ( a to z )
        Arrays.sort(even2);
        Arrays.sort(odd1);
        Arrays.sort(odd2);

        return Arrays.equals(even1, even2) && Arrays.equals(odd1, odd2);
    }

}
