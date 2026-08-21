package LeetCode;

//151. Reverse Words in a String

public class ReverseWordsinaString {
    public static void main(String[] args) {


       String s = "a good   example";

//        String [] words = s.split(" ");
//
//        for (int q = 0; q < words.length; q++) {
//            System.out.print(words[q]);
//        }

        System.out.println(reverseWords2(s));

    }
    static String reverseWords(String s) {
        s.trim();
        String [] words = s.split(" ");

        String ans = "";
        for (int i = words.length - 1 ; i >=0; i--) {
            words[i].trim();
            if(words[i].equals("")){
                continue;
            }
            ans = ans + words[i]+" ";

        }

        return ans.trim() ;

    }


    static String reverseWords2(String s) {
        String[] words = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();
        for(int i = words.length-1; i >= 0; i--){
            sb.append(words[i]);

            if(i != 0){
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
