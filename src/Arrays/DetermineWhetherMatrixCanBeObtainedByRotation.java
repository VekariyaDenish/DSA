package Arrays;

//1886. Determine Whether Matrix Can Be Obtained By Rotation

public class DetermineWhetherMatrixCanBeObtainedByRotation {
    public static void main(String[] args) {
        int [][] arr = {{0,0,0},{0,1,0},{1,1,1}};
        int [][] target = {{1,1,1},{0,1,0},{0,0,0}};

        System.out.println(findRotation(arr,target));

    }
    static boolean findRotation(int[][] mat, int[][] target) {
        for (int k = 0; k < 4; k++) {
            if (equals(mat, target)) return true;
            mat = rotate(mat);
        }
        return false;
    }

    static int[][] rotate(int[][] mat) {
        int n = mat.length;
        int[][] res = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = mat[j][n - 1 - i];
            }
        }
        return res;
    }

    static boolean equals(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] != b[i][j]) return false;
            }
        }
        return true;
    }
}


// this is true but it fail in one test case of leetcode

//        int n = mat.length;
//        for(int i = 0;i<10;i++){
//           if(isSame(mat,target)){
//               return true;
//           }
//           mat = rotate(mat);
//        }
//        return false;
//
//    }
//
//    static int [][] rotate(int[][] mat ){
//        int n = mat.length;
//        int [][] ans = new int[n][n];
//
//        for(int i = 0;i< n;i++){
//            for(int j= 0;j<n;j++){
//                ans[i][j] = mat[j][n-i-1];
//            }
//        }
//        return ans;
//    }
//    static boolean isSame(int [][] a , int [][] b){
//        int n = a.length;
//        for(int i = 0;i< n;i++){
//            for(int j= 0;j<n;j++){
//                if (b[i][j] != a[i][j]){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//}

