package ConditionLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UntilZeroSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E_sum = 0;
        int O_sum = 0;
        int n_sum=0;
        List<Integer> list = new ArrayList<>();

        while (true){
            int num = sc.nextInt();
            if(num !=0){
                list.add(num);
                if(num>0){
                    if(num%2==0){
                        E_sum +=num;
                    } else if (num%2!=0) {
                        O_sum +=num;
                    }
                }
                else {
                    n_sum +=num;
                }
            }
            else {
                break;
            }
        }
        System.out.println("Entered Numbers: " + list);
        System.out.println("Sum of Negative Numbers = " + n_sum);
        System.out.println("Sum of Positive Even Numbers = " + E_sum);
        System.out.println("Sum of Positive Odd Numbers = " + O_sum);
    }
}
