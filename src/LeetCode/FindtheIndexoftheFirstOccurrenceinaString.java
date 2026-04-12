package LeetCode;

//28. Find the Index of the First Occurrence in a String

public class FindtheIndexoftheFirstOccurrenceinaString {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad" , "sad"));
    }
    static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
