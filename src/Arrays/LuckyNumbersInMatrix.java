package Arrays;

import java.util.ArrayList;
import java.util.List;

// 1380. Lucky Numbers in a Matrix

public class LuckyNumbersInMatrix {
    public static void main(String[] args) {

        int [][] arr = {{3,7,8},{9,11,13},{15,16,17}};

        System.out.println(luckyNumbers(arr));


    }

    // leetcode me dusri easy way se kiya hua hai
    static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int minVal = matrix[i][0];
            int minIndex = 0;

            // min in row
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                    minIndex = j;
                }
            }
            // check max in column
            boolean isMax = true;
            for (int r = 0; r < matrix.length; r++) {
                if (matrix[r][minIndex] > minVal) {
                    isMax = false;
                    break;
                }
            }
            if (isMax) list.add(minVal);
        }
        return list;


//        int minTemp =0;
//        int maxTemp = 0;
//
//
//        while (n>0){
//            int min = arr[0][0];
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    if(min>arr[i][j]){
//                        min = arr[i][j];
//                        minTemp = min;
//                    }
//                }
//                min =0;
//            }
//            n--;
//        }
//         n=matrix.length;
//        while (n>0){
//            int max = arr[0][0];
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    if(max<arr[i][j]){
//                        max = arr[i][j];
//                        maxTemp = max;
//                    }
//                }
//                max =0;
//            }
//            n--;
//        }
//         list.add(minTemp);
//        list.add(maxTemp);
//
//        return list;
    }
}
