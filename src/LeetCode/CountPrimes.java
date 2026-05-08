package LeetCode;

//204. Count Primes

public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(countPrimes(40));

    }
    static int countPrimes(int n) {
        if (n <= 2) return 0;

        boolean[] notPrime = new boolean[n];

        for (int i = 2; i * i < n; i++) {

            if (!notPrime[i]) {

                for (int j = i * i; j < n; j += i) {
                    notPrime[j] = true;
                }
            }
        }

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (!notPrime[i]) {
                count++;
            }
        }

        return count;
    }
}
