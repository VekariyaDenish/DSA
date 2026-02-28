package Search;


//167. Two Sum II - Input Array Is Sorted

import java.util.Arrays;

public class TwoSumInputArrayIsSorted {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr , 9)));
    }
    static int[] twoSum(int[] numbers, int target) {
        int [] ans = new int[2];

        for(int i = 0 ; i<numbers.length ; i++){
            for(int j = i+1 ; j<numbers.length ; j++){
                if(numbers[i]+numbers[j] == target){
                    ans[0] = i+1;
                    ans[1] = j+1;
                    return ans;
                }
            }
        }
        return new int[] { -1 , -1};
    }
}
