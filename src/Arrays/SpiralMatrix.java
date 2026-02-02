package Arrays;

//54. Spiral Matrix

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println((spiralOrder(arr)));

    }
    static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();
        int rowBegin = 0,colBegin = 0;
        int rowEnd = matrix.length -1 ,colEnd = matrix[0].length-1;

        while (rowBegin<=rowEnd && colBegin<=colEnd){

            for (int j = colBegin; j <=colEnd; j++) {
                list.add(matrix[rowBegin][j]);
            }
            rowBegin++;

            for (int j = rowBegin ; j<=rowEnd ; j++){
                list.add(matrix[j][colEnd]);
            }
            colEnd--;

            if(rowBegin<=rowEnd){
                for (int j = colEnd ; j>= colBegin ; j--){
                    list.add(matrix[rowEnd][j]);
                }
            }
                rowEnd--;

            if(colBegin<=colEnd){
                for (int j = rowEnd ; j>=rowBegin ; j--){
                    list.add(matrix[j][colBegin]);
                }
            }
                colBegin++;

        }
        return list;
    }

}
