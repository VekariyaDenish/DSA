package Arrays;

import java.util.Arrays;

//1.two sum
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {7,2,4,1};
        int target =9;
        int [] ans = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++)
             if(arr[i]+arr[j]==target){
                ans[0]=i;
                ans[1]=j;
            }
        }
            System.out.println(Arrays.toString(ans));
    }
}

