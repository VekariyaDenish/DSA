package LeetCode;

//728. Self Dividing Numbers

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {

        System.out.println(selfDividingNumbers(1,22));

    }
    static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for (int number = left; number <= right; number++) {

            int temp = number;
            Boolean isDiv = true;

            while (temp > 0){
                int digit = temp % 10 ;

                if(digit == 0 || number % digit != 0) {
                    isDiv = false;
                    break;
                }

                temp /=10;
            }

            if(isDiv){
                list.add(number);
            }
        }
        return list;

    }

}
