package LeetCode;

//56. Merge Intervals

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
    public static void main(String[] args) {

        int[][] ans = {{1,3},{2,6},{8,10},{15,18}};

        System.out.println(Arrays.deepToString(merge(ans)));

    }
    static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int []> result = new ArrayList<>();
        result.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {

            int current_start = intervals[i][0];
            int current_end = intervals[i][1];

            if (current_start > result.get(result.size() - 1)[1]) {         //no overlapping
                result.add(intervals[i]);
            }
            else {              //overlapping
                result.get(result.size()-1)[1] = Math.max(result.get(result.size()-1)[1] , current_end);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

}
