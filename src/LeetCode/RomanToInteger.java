package LeetCode;

//13. Roman To  Integer

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    static int romanToInt(String s) {

        int res = 0;
        int prev = 0;

        for (int i = s.length()-1; i >=0 ; i--) {

            int curr = getValue(s.charAt(i));

            if(prev>curr){
                res = res-curr;
            }else res = res + curr;

            prev = curr;
        }
        return res;
    }
    static int getValue(char c){
        if(c =='I') return 1;
        if(c =='V') return 5;
        if(c =='X') return 10;
        if(c =='L') return 50;
        if(c =='C') return 100;
        if(c =='D') return 500;
        return 1000;
    }
}
