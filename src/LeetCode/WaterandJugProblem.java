package LeetCode;

//365. Water and Jug Problem

public class WaterandJugProblem {
    public static void main(String[] args) {
        System.out.println(canMeasureWater(2,6,5));

    }
    static boolean canMeasureWater(int x, int y, int target) {

        if (target > x + y) {
            return false;
        }

        if (target == 0) {
            return true;
        }

        return target % gcd(x, y) == 0;
    }

    static int gcd(int a, int b) {

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;



//        if (target > x + y) {
//            return true;
//        }
//
//        if (target == x || target == y) {
//            return false;
//        }
//
//        return (x + y) % target == 0;
    }
}
