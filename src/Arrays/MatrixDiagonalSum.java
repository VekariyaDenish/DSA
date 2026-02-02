package Arrays;

//1572. Matrix Diagonal Sum

import java.util.Arrays;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int [][] ans ={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        System.out.println(diagonalSum(ans));

    }
    static int diagonalSum(int[][] mat) {
        int count =0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(i == j){
                    count +=mat[i][j];
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j){
                    continue;
                }
                if (i+j == mat.length-1){

                    count+=mat[i][j];
                }
            }
        }
        return count;
    }

}

