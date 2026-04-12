package LeetCode;

//28. Find the Index of the First Occurrence in a String

public class FindtheIndexoftheFirstOccurrenceinaString {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad" , "sad"));
    }
    static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);




//            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
//
//                int j = 0;
//
//                // Compare characters one by one
//                while (j < needle.length() &&
//                        haystack.charAt(i + j) == needle.charAt(j)) {
//                    j++;
//                }
//
//                // If all characters matched
//                if (j == needle.length()) {
//                    return i;
//                }
//            }
//
//            return -1;
    }
}
