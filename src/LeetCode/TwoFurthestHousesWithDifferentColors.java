package LeetCode;

//2078. Two Furthest Houses With Different Colors

public class TwoFurthestHousesWithDifferentColors {
    public static void main(String[] args) {
        int [] colors = {1,1,1,6,1,1,1};
        System.out.println(maxDistance(colors));
    }
    static int maxDistance(int[] colors) {
        int n = colors.length;

        int left = 0;
        int right = n - 1;

        // Case 1: Fix left, move right inward
        while (colors[left] == colors[right]) {
            right--;
        }
        int maxDist1 = right - left;

        // Case 2: Fix right, move left inward
        left = 0;
        right = n - 1;
        while (colors[left] == colors[right]) {
            left++;
        }
        int maxDist2 = right - left;

        return Math.max(maxDist1, maxDist2);
    }
}
