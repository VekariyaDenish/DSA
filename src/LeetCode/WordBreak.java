package LeetCode;

//139. Word Break

import java.util.List;

public class WordBreak {
    public static void main(String [] args){

    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        return solve(s, wordDict, 0);
    }

    static boolean solve(String s, List<String> wordDict, int index) {


        // Base case: entire string matched only one word
        if (index == s.length()) {
            return true;
        }


        // Try every word in dictionary List
        for (String word : wordDict) {

            // Check if word matches at current index
            if (index + word.length() <= s.length() &&
                    s.substring(index, index + word.length()).equals(word)) {


                // used the recursion for next check
                if (solve(s, wordDict, index + word.length())) {
                    return true;

                }

            }
        }

        return false;
    }
}
