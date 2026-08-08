package StriverSheet;

import java.util.HashMap;

//Length of Longest Substring without any Repeating Character
public class LengthofLongestSubstringwithoutanyRepeatingCharacter {
    public static void main(String[] args) {

        int [] arr = {9,-3,3,-1,6,-5};

        System.out.println(maxLen(arr,6));

    }
    static int maxLen(int [] arr , int n) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int max = 0, sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if(sum == 0){
                max = i + 1;
            }else {
                if(map.containsKey(sum)){
                    max = Math.max(max , i - map.get(sum));
                }else{
                    map.put(sum , i);
                }
            }
        }
        return max;
    }
}
