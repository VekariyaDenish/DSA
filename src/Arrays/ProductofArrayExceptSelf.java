package Arrays;

//238. Product of Array Except Self

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    static int[] productExceptSelf(int[] nums) {
//        int n = nums.length;
//        int[] leftProducts = new int[n];
//        int[] rightProducts = new int[n];
//        int[] result = new int[n];
//
//        // Calculate products of all elements to the left of each element
//        leftProducts[0] = 1;
//        for (int i = 1; i < n; i++) {
//            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
//        }
//
//        // Calculate products of all elements to the right of each element
//        rightProducts[n - 1] = 1;
//        for (int i = n - 2; i >= 0; i--) {
//            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
//        }
//
//        // Multiply left and right products to get the final result
//        for (int i = 0; i < n; i++) {
//            result[i] = leftProducts[i] * rightProducts[i];
//        }
//
//        return result;

        int i = 0 , j = 0;
        int product = 1;

        int [] ans = new int[nums.length];

        while (i< nums.length){
            product = 1;
            for ( j = 0; j < nums.length; j++) {
                if( i == j ) {
                    continue;
                }
                else {
                    product*=nums[j];
                }
            }
            ans[i] = product;
            i++;
        }
        return ans;
    }
}
