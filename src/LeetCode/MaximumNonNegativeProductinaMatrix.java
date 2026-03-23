package LeetCode;

//1594. Maximum Non Negative Product in a Matrix

public class MaximumNonNegativeProductinaMatrix {
    public static void main(String[] args) {
        int [][] grid = {{-1,-2,-3},{-2,-3,-3},{-3,-3,-2}};
        System.out.println(maxProductPath(grid));
    }
    public static int maxProductPath(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        long[] max = new long[n];
        long[] min = new long[n];

        max[0] = grid[0][0];
        min[0] = grid[0][0];

        // First row
        for (int j = 1; j < n; j++) {
            max[j] = max[j-1] * grid[0][j];
            min[j] = max[j];
        }

        for (int i = 1; i < m; i++) {
            // First column
            max[0] = max[0] * grid[i][0];
            min[0] = max[0];

            for (int j = 1; j < n; j++) {
                long a = max[j] * grid[i][j];     // from top
                long b = min[j] * grid[i][j];     // from top
                long c = max[j-1] * grid[i][j];   // from left
                long d = min[j-1] * grid[i][j];   // from left

                long newMax = Math.max(Math.max(a, b), Math.max(c, d));
                long newMin = Math.min(Math.min(a, b), Math.min(c, d));

                max[j] = newMax;
                min[j] = newMin;
            }
        }

        long res = max[n-1];
        int mod = 1000000007;

        if (res < 0) return -1;
        return (int)(res % mod);
    }
}
