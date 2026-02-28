package Search;


//367. Valid Perfect Square

public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }
    static boolean isPerfectSquare(int num) {
        if (num == 1) return true;

        long i = 1;

        while(i* i <=num){
            if( i * i == num){
                return true;
            }
            i++;
        }
        return false;
    }
}
