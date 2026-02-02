package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 66. Plus One
public class PlusOne {
    public static void main(String[] args) {
        int [] arr={9,9,9};
        System.out.println(Arrays.toString(plusOne(arr)));

    }
    static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i > 0; i--) {
            if(digits[i]!=9){
                digits[i]+=1;
                return digits;
            }
            digits[0] = 1;
        }
        digits = new int[digits.length+1];
        digits[0] =1;
        return digits;
    }
}
