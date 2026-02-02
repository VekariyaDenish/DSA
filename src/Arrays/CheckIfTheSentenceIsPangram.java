package Arrays;

//1832. Check if the Sentence Is Pangram

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(checkIfPangram(sentence));
    }
    static boolean checkIfPangram(String sentence) {

        if(sentence.length() <26){
            return false;
        }
        for (char i = 'a' ; i<='z';i++) {
            if (sentence.indexOf(i) == -1) {
                return false;
            }
        }
            return true;
    }
}
