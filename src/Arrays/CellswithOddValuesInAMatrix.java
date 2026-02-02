package Arrays;

//1252. Cells with Odd Values in a Matrix

public class CellswithOddValuesInAMatrix {
    public static void main(String[] args) {
        int [][] ans = {{0,1},{1,1}};
        System.out.println(oddCells(2,3,ans));
    }
    static int oddCells(int m, int n, int[][] indices) {
        int [][] matrix = new int[m][n];

        for (int i = 0; i < indices.length; i++) {
            int r = indices[i][0];
            int c = indices[i][1];

            // Increment entire row r
            for (int j = 0; j < n; j++) {
                matrix[r][j]++;
            }

            // Increment entire column c
            for (int j = 0; j < m; j++) {
                matrix[j][c]++;
            }
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] %2 != 0){
                    count++;
                }
            }
        }
        return count;
    }
}
