package LeetCode;

//2833. Furthest Point From Origin

public class FurthestPointFromOrigin {
    public static void main(String[] args) {
        String moves = "L_RL__R";
        System.out.println(furthestDistanceFromOrigin(moves));
    }
    static int furthestDistanceFromOrigin(String moves) {
        int left = 0, right = 0, blank = 0;

        for (char c : moves.toCharArray()) {
            if (c == 'L') left++;
            else if (c == 'R') right++;
            else blank++;
        }

        int position = right - left;

        return Math.abs(position) + blank;
    }
}
