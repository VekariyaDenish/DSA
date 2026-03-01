package Search;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionofTwoArrays {
    public static void main(String[] args) {
//        int [] arr = {4,9,5};
//        int [] num = {9,4,9,8,4};

        int [] arr = {1,2,2,1};
        int [] num = {2,2};

        System.out.println(Arrays.toString(intersection(arr,num)));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] ) {
                    list.add(nums2[j]);
                    nums2[j] = -1; // mark as used
                    break;         // move to next nums1[i]
                }
            }
        }

        int [] ans = new int[list.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
