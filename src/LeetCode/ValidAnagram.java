package LeetCode;

//242. Valid Anagram

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {

        System.out.println(isAnagram("car", "rat"));

    }
    static boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();


        Arrays.sort(s1);
        Arrays.sort(s2);

        for (int i = 0; i < s1.length; i++) {
                if(s1[i] != s2[i]){
                    return false;
                }
        }
        return true;
    }
}
