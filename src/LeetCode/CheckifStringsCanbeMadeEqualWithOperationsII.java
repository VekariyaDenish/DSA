package LeetCode;

//2840. Check if Strings Can be Made Equal With Operations II

public class CheckifStringsCanbeMadeEqualWithOperationsII {
    public static void main(String[] args) {

        System.out.println(checkStrings("abcdba" , "cabdab"));

    }
    static boolean checkStrings(String s1, String s2) {
        int [] even = new int[26];
        int [] odd = new int[26];

        int n = s1.length();

        for (int i = 0; i < n; i++) {
            if(i %2 == 0){ // even character is collected
                even[s1.charAt(i) - 'a'] ++; // [ 1,0,1,0]
                even[s2.charAt(i) - 'a'] --; // [1-1 = 0 , 0 , 1-1 = 0 , 0 ]
            }
            else {
                odd[s1.charAt(i) - 'a'] ++;
                odd[s2.charAt(i) - 'a'] --;
            }
        }
        for (int i = 0; i < 26; i++) {
            if(even[i] != 0 || odd[i] != 0){
                return false;
            }
        }
        return true;
    }
}
