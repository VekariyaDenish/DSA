package ConditionLoop;

public class Factorial {
    public static void main(String[] args) {
        int n = 4;
        int ans = 1;
        for(int i = 1 ; i <=n ; i++){
         ans = n * (n-1);
        }
        System.out.println(ans);
    }
}
