package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));

    }
    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i <numRows; i++) {
            List<Integer> rows= new ArrayList<>(i+1);

            for (int j = 0; j <= i; j++) {
                if(j == 0 || j ==i ){
                    rows.add(1);
                }
                else {
                    int ans = result.get(i-1).get(j) + result.get(i-1).get(j-1);
                    rows.add(ans);
                }
            }
            result.add(rows);


        }
        return result;
    }
}
