package Arrays;

//989. Add to Array-Form of Integer

import java.util.ArrayList;
import java.util.List;

public class AddtoArrayFormofInteger {
    public static void main(String[] args) {
        int [] num = {1,2,0,0};
        System.out.println(addToArrayForm(num,34));

    }
    static List<Integer> addToArrayForm(int[] num, int K) {

        List<Integer> res = new ArrayList<>();
        for (int i = num.length - 1; i >= 0; --i) {
            res.add(0, (num[i] + K) % 10);
            K = (num[i] + K) / 10;
        }
        while (K > 0) {
            res.add(0, K % 10);
            K /= 10;
        }
        return res;

    }
}
