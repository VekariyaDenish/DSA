package LeetCode;

//3. Longest Substring Without Repeating Characters

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // If duplicate found AND it's within current window
            if (map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + 1;  // shrink window past the duplicate
            }

            map.put(c, right);          // update latest index of char
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
