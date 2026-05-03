package LeetCode;

//2615. Sum of Distances

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumofDistances {
    public static void main(String[] args) {
        int [] nums = {1,3,1,1,2};
        System.out.println(distance(nums));
    }
     static long[] distance(int[] arr) {
        int n = arr.length;
        long[] result = new long[n];

        // Step 1: group indices by value
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
        }

        // Step 2: process each group
        for (List<Integer> indices : map.values()) {
            int size = indices.size();
            long totalSum = 0;

            // sum of all indices
            for (int idx : indices) {
                totalSum += idx;
            }

            long leftSum = 0;

            for (int i = 0; i < size; i++) {
                int index = indices.get(i);

                // left side contribution
                long left = (long) index * i - leftSum;

                // right side contribution
                long right = (totalSum - leftSum - index)
                        - (long) index * (size - i - 1);

                result[index] = left + right;

                leftSum += index;
            }
        }

        return result;
    }
}
