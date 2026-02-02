package ConditionLoop;

public class Power {
    public static void main(String[] args) {
        int ans = 1;
        int base = 2;
        int power = 3;

        for (int i = 0; i < power; i++) {
            ans *=base;
        }
        System.out.println(ans);
    }
}
