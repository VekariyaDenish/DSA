package Arrays;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int [] ans = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(ans,3)));
    }
    static int[] shuffle(int[] nums, int n) {
        int [] ans = new int[2*n];
        int k =0;
        for(int i = 0; i < n; i++) {
            ans[k] = nums[i];
            k= k+2;
        }
        k=0;
        for (int i = 0; i < n; i++) {
            ans[k+1] =nums[i+n];
            k+=2;
        }
        return ans;
    }
}
