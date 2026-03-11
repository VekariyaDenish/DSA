package String;

//1859. Sorting the Sentence

public class SortingtheSentence {
    public static void main(String[] args) {
        String s1 = "is2 sentence4 This1 a3";

    }
    static String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] ans = new String[arr.length];

        for (String word : arr) {
            int index = word.charAt(word.length() - 1) - '0';
            ans[index - 1] = word.substring(0, word.length() - 1);
        }

        StringBuilder sb = new StringBuilder();
        for (String word : ans) {
            sb.append(word).append(" ");
        }

        return sb.toString().trim();

//        String[] words = s.split(" ");
//        String[] ans = new String[words.length];
//
//        for (int i = 0; i < words.length; i++) {
//
//            String word = words[i];
//            int index = word.charAt(word.length() - 1) - '0';
//
//            ans[index - 1] = word.substring(0, word.length() - 1);
//        }
//
//        String result = "";
//
//        for (int i = 0; i < ans.length; i++) {
//            result += ans[i] + " ";
//        }
//
//        return result.trim();
    }

}
