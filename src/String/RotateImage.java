package String;

import java.util.Arrays;

//48. Rotate Image
public class RotateImage {
    public static void main(String[] args) {

        int [][] ans = {{1,2,3},{4,5,6}, {7,8,9}};
        rotate(ans);
        System.out.println((Arrays.toString(ans)));
    }
    static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for (int k = 0; k < n; k++) {
            int i = 0, j = n - 1;
            while (i < j) {
                int temp = matrix[k][i];
                matrix[k][i] = matrix[k][j];
                matrix[k][j] = temp;
                i++;
                j--;
            }
        }
    }
}
