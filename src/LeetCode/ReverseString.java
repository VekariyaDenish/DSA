package LeetCode;

//344. Reverse String

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char [] c = {'h','e','l' ,'l','o'};
        reverseString(c);
        System.out.println( Arrays.toString(c));

    }
    static void  reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }

    }
}
