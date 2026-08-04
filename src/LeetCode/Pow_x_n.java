package LeetCode;

//50. Pow(x, n)

public class Pow_x_n {
    public static void main(String[] args) {
        System.out.println(myPow(2,4));

    }
    static double myPow(double x, long n){
            if(n == 0) return 1;

           else if(n < 0) return myPow((1/x) ,-n);

            else if(n % 2 == 0) return myPow(x * x , (n/2));

            else {
                return x * myPow(x * x , (n-1)/2);
            }
    }
}
