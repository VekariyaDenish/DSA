package Arrays;


//73. Set Matrix Zeroes

public class SetMatrixZeroes {
    public static void main(String[] args) {

        int [][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        // Step 1: mark zero rows and columns
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Step 2: set rows to zero
        for (int i = 0; i < m; i++) {
            if (row[i]) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: set cols to zero
        for (int j = 0; j < n; j++) {
            if (col[j]) {
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

    }
//    static void setZeroes(int[][] matrix) {
//        int m = matrix.length;
//        int n = matrix[0].length;
//
//        boolean[] row = new boolean[m];
//        boolean[] col = new boolean[n];
//
//        // Step 1: mark zero rows and columns
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (matrix[i][j] == 0) {
//                    row[i] = true;
//                    col[j] = true;
//                }
//            }
//        }
//
//        // Step 2: set rows to zero
//        for (int i = 0; i < m; i++) {
//            if (row[i]) {
//                for (int j = 0; j < n; j++) {
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//
//        // Step 3: set cols to zero
//        for (int j = 0; j < n; j++) {
//            if (col[j]) {
//                for (int i = 0; i < m; i++) {
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//
//    }
}
