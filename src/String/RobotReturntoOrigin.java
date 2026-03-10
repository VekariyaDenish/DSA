package String;

//657. Robot Return to Origin

public class RobotReturntoOrigin {
    public static void main(String[] args) {

    }
    static boolean judgeCircle(String moves) {
        int l = 0;
        int u = 0;
        int d = 0;
        int r = 0;

        for (int i = 0; i < moves.length(); i++) {
            int ch = (int) moves.charAt(i);

            if(ch == (int)'L'){
                l++;
            } else if (ch == (int)'R') {
                r++;
            }else if(ch == (int)'U'){
                u++;
            } else if (ch == (int)'D') {
                d++;
            }
        }

        if(l-r ==0 && d-u ==0){
            return true;
        }
        return false;
    }
}
