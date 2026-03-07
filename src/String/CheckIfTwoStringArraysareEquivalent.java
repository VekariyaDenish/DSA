package String;

//1662. Check If Two String Arrays are Equivalent

public class CheckIfTwoStringArraysareEquivalent {
    public static void main(String[] args) {
        String [] word1 = {"ab","c"};
        String []  word2 = {"a", "bc"};

        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String FirstWord = "";
        for (int i = 0; i < word1.length; i++) {
            FirstWord = FirstWord + word1[i];
        }
        String SecondWord = "";
        for (int j = 0; j < word2.length; j++) {
            SecondWord = SecondWord + word2[j];
        }

        return FirstWord .equals(SecondWord);
    }
}
