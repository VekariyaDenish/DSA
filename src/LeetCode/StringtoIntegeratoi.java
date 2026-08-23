package LeetCode;

//8. String to Integer (atoi)

public class StringtoIntegeratoi {
    public static void main(String[] args) {

        System.out.println(myAtoi(" -042"));

    }
    static int myAtoi(String s) {

        s = s.trim();

        if(s.length() == 0) return 0;

        int i = 0 ;
        int sign = 1;



        if(s.charAt(i)== '-'){
            sign = -1;
            i++;
        }
        else if ( s.charAt(i) == '+'){
            i++;
        }


        long ans = 0;
        while (i<s.length()){

            char curr = s.charAt(i);

            if(curr < '0' ||  curr > '9'){
                break;
            }

            ans = ans * 10 + (curr - '0');

            if(sign == 1 && ans>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign == -1 && -ans<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) ans * sign;
    }
}
