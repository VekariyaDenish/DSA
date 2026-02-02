package Search;


// 69. sqrt of X
public class sqrt {
    public static void main(String[] args) {
        System.out.println(sqrtOfx(8));

    }
    static int sqrtOfx(int x){
        int i=0;

        while((long) i*i <= x){
            i++;
        }
        return i-1;
    }
}
