package Search;


//118. Pascal's Triangle

import Arrays.ProductofArrayExceptSelf;

import java.util.ArrayList;
import java.util.List;

public class pascalsTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));

    }
    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                int num = list.get(i-1).get(j) +list.get(i-1).get(j-1);
                row.add(num);
            }

            if(0<i){
                row.add(1);
            }
            list.add(row);
        }
        return list;
    }
}
