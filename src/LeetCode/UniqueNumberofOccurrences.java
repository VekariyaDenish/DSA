package LeetCode;

//1207. Unique Number of Occurrences

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberofOccurrences {
    public static void main(String[] args) {
        int [] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));

    }
    static boolean uniqueOccurrences(int[] arr) {
        int[] ans = new int[2001];

        for (int x : arr) {
            ans[x + 1000]++;
        }

        Arrays.sort(ans);


        for (int i = 1; i < 2001; i++) {
            if (ans[i] != 0 && ans[i] == ans[i - 1]) {
                return false;
            }
        }
        return true;


    }

    static boolean uniqueOccurrences2(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Store frequency of each number
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();

        for (int freq : map.values()) {
            if (set.contains(freq)) {
                return false;
            }
            set.add(freq);
        }

        return true;
    }
}
