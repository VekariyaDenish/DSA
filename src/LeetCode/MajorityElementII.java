package LeetCode;

//229. Majority Element II

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public static class MajorityElementII {
    public static void main(String[] args) {

        int[] nums = {3,2,3};

        MajorityElementII sol = new MajorityElementII();
        List<Integer> ans = sol.majorityElement(nums);

        System.out.print("The majority elements are: ");
        for (int it : ans) {
            System.out.print(it + " ");
        }
        System.out.println();
    }



}
    private static List<Integer> majorityElement(int[] nums) {

        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int mini = n / 3 + 1;

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            // Add to result only when the count just reaches mini
            if (map.get(nums[i]) == mini) {
                result.add(nums[i]);
            }

            if (result.size() == 2) break;
        }

        return result;
    }
}
