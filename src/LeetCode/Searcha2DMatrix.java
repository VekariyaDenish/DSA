package LeetCode;

//74. Search a 2D Matrix

public class Searcha2DMatrix {
    public static void main(String[] args) {
        int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix,3));
    }
    static boolean searchMatrix(int[][] matrix, int target) {
//        int m = matrix.length;
//        int n = matrix[0].length;
//
//        int i = 0, j = n-1;
//
//        while(i < m && j >= 0) {
//            if(matrix[i][j] > target) {
//                j--;
//            } else if(matrix[i][j] < target) {
//                i++;
//            } else {
//                return true;
//            }
//        }
//
//        return false;
//
//        }

        int m = matrix.length;
        int n = matrix[0].length;

        int start = 0;
        int end   = m*n-1;

        while(start <= end) {
            int mid = start + (end-start)/2;

            int row = mid/n;
            int col = mid%n;

            if(matrix[row][col] > target) {
                end = mid-1;
            } else if(matrix[row][col] < target) {
                start = mid+1;
            } else {
                return true;
            }
        }

        return false;
    }

}
