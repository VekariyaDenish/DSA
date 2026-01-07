package Arrays;

//832. Flipping an Image

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int [][] num ={{1,1,0},{1,0,1},{0,0,0}};
        String string = Arrays.deepToString(flipAndInvertImage(num));
        System.out.println(string);

    }
    static int[][] flipAndInvertImage(int[][] image) {

        // reverse the 2D array
        for (int i = 0; i < image.length; i++) {
            int start =0 ;
            int end  = image.length-1;
               while (start<end){
                    int temp = image[i][start];
                    image[i][start] = image[i][end];
                    image[i][end]=temp;
                    start++;
                    end--;
                }

       }
       // invert number from 0 -> 1
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                if(image[i][j] == 0){
                    image[i][j]=1;
                }else {
                    image[i][j]=0;
                }
            }
        }
        return image;
    }
}
