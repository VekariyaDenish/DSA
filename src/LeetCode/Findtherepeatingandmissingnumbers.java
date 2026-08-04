package LeetCode;

import java.util.Arrays;

public class Findtherepeatingandmissingnumbers {
    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 6, 7, 5, 7};
        System.out.println(Arrays.toString(check(arr)));

    }
    static int[] check(int [] arr ){
        int [] heap = new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            heap[arr[i]] ++;
        }

        int missing = -1 , repeat = -1;

        for (int i = 1; i < heap.length ; i++) {
            if(heap[i] == 2){
                repeat = i;
            } else if (heap[i] == 0) {
                missing = i;
            }

            if(missing != -1 && repeat != -1){
                break;
            }
        }
        return new int []{repeat , missing};
    }
}
