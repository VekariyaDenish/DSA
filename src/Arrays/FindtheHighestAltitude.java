package Arrays;

//1732. Find the Highest Altitude

public class FindtheHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));

    }
    static int largestAltitude(int[] gain) {
        int [] ans = new int[gain.length+1];
        for (int i = 0; i < gain.length; i++) {
            ans[i+1] = ans[i]+gain[i];
        }
       int max = ans[0];
        for (int i = 0; i < ans.length; i++) {
            if(max<ans[i]){
                max=ans[i];
            }
        }
        return max;
    }
}

