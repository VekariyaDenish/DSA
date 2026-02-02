package ConditionLoop;

public class NumberPalindrome {
    public static void main(String[] args) {
        int num = 1221;
        int ans = 0;
        int temp = num;

        while(temp >0){
            int rem = temp%10;
            ans = ans * 10 + rem;
            temp/=10;
        }
        if(ans!=num){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
    }
}
