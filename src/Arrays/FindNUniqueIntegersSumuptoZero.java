package Arrays;

//1304. Find N Unique Integers Sum up to Zero

import java.util.Arrays;

public class FindNUniqueIntegersSumuptoZero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(3)));

    }
    static int[] sumZero(int n) {
        int [] arr = new int[n];
        int k = 1;
        for (int i = 0; i < n / 2; i++) {
            arr[i] = k;
            arr[n - 1 - i] = -k;
            k++;
        }
        return arr;

        //Issues
        //
        //if(i + -(i) == 0) is always true → waste condition
        //
        //You fill pairs only until n-1, so:
        //
        //Works only if n is even
        //
        //For odd n, middle stays 0, but you never write it
        //
        //temp array is unused
        //
        //Your array may contain default zeros accidentally without logic


//        int [] arr = new int[n];
//        int [] temp = new int[n];
//
//        for (int i = 0; i < n-1; i++) {
//           if(i+ -(i) == 0){
//               arr[i]=i;
//               arr[i+1] = -(i);
//               i++;
//           }
//        }
//        return arr;
    }
}
