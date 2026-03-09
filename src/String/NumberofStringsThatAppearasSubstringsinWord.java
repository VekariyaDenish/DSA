package String;

//1967. Number of Strings That Appear as Substrings in Word

public class NumberofStringsThatAppearasSubstringsinWord {
    public static void main(String[] args) {
        String [] patterns = {"a","b","c"};
        System.out.println(numOfStrings(patterns,"aaaaabbbbb"));
    }

    static int numOfStrings(String[] patterns, String word) {

        int count =0;
        for(int i=0;i<patterns.length;i++)
        {
            if(word.contains(patterns[i]))
            {
                count++;
            }
        }
        return count;

        // int count = 0;

        // for (int i = 0; i < patterns.length; i++) {
        //     String p = patterns[i];

        //     for (int j = 0; j <= word.length() - p.length(); j++) {
        //         int k = 0;

        //         while (k < p.length() && word.charAt(j + k) == p.charAt(k)) {
        //             k++;
        //         }

        //         if (k == p.length()) {
        //             count++;
        //             break;
        //         }
        //     }
        // }

        // return count;
    }
}
