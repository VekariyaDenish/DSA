package LeetCode;

import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {

        int [][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        setZeroes(matrix);

        System.out.println(matrix);

    }
    static void setZeroes(int[][] matrix) {
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
}

/*    static void setZeroes(int[][] matrix) {

        ArrayList<int[]> zeros = findZeros(matrix);

        for (int[] pos : zeros) {
            rowZero(pos[0], matrix);
            colZero(pos[1], matrix);
        }
    }

    static ArrayList<int[]> findZeros(int[][] matrix) {

        ArrayList<int[]> list = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    list.add(new int[]{i, j});
                }
            }
        }

        return list;
    }

    static void rowZero(int row, int[][] matrix) {

        for (int j = 0; j < matrix[0].length; j++) {
            matrix[row][j] = 0;
        }
    }

    static void colZero(int col, int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }

//    static void setZeroes(int[][] matrix) {
//        rowZero(findZero(matrix), matrix);
//        colZero(findZero(matrix),matrix);
//    }
//    static int[] findZero(int [][] matrix){
//        int [] ans = new int[2];
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if(matrix[i][j] == 0){
//                    ans[0] = i;
//                    ans[1] = j;
//                }
//            }
//        }
//        return ans;
//    }
//    static int [][] rowZero(int [] ans , int [][] matrix){
//
//        for (int i = 0; i < matrix.length; i++) {
//            int checkRow = ans[0]-1;
//            for (int j = 0; j < matrix[0].length; j++) {
//                matrix[checkRow][j] = 0;
//            }
//        }
//        return matrix;
//    }
//    static int [][] colZero(int [] ans , int [][] matrix){
//
//        for (int i = 0; i < matrix.length; i++) {
//            int checkCol = ans[1];
//            for (int j = 0; j < matrix[0].length; j++) {
//                matrix[i][checkCol] = 0;
//            }
//        }
//        return matrix;
//    }
}*/
