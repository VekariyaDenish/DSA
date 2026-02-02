package ConditionLoop;

public class SubtractSumAndMul {
    public static void main(String[] args) {
        int x = 234;
        int sum = 0;
        int mul =1;

        while(x>0){
            int rem = x %10;
            sum = sum +rem;
            mul = mul * rem;
            x = x/10;
        }
        int subtract = mul - sum;
        System.out.println(subtract);

    }
}
