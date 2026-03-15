package LeetCode;

//169. Majority Element

public class MajorityElement {
    public static void main(String[] args) {
            int [] ans = {3,2,3};
        System.out.println(majorityElement(ans));
    }
    static int majorityElement(int[] nums) {
        int ans = 0;
        int count = 0;

        for(int num : nums){
            if(count == 0){
                ans = num;
            }

            if(ans == num){
                count++;
            }
            else{
                count--;
            }
        }
        return ans;

    }
}
