package Arrays;

import java.util.ArrayList;

public class spiralMatrix_3 {
    public static void main(String[] args) {

        System.out.println(spiralMatrixIII(5,6,1,4));

    }
    static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

       int rowStart = 0 ;
       int rowEnd = rows -1 ;
       int colStart = 0;
       int colEnd = cols -1;

       int [][]ans = new int[rows][cols];
       ans [rStart][cStart] = 1;
       int firstCheck = rStart;
       int secondCheck = cStart;
       int[][] indexChecked = new int[1][2];
        ArrayList<int[][]> list = new ArrayList<>();

       int n =1;

       while(rowStart<=rowEnd && colStart<=colEnd){

           // left to right
           for (int j = cols; j <=colEnd; j++) {
               ans[rStart][j] = n++;
              indexChecked[0][1] =  indexChecked[rStart][j];
              list.add(indexChecked);
           }

       }
       return indexChecked;
    }


}
