package Search;


//1608. Special Array With X Elements Greater Than or Equal X

public class SpecialArrayWithXElementsGreaterThanorEqualX {
    public static void main(String[] args) {
        int [] arr = {0,4,3,0,4};
        System.out.println(specialArray(arr));

        }
    static int specialArray(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if( nums[i]<=0){
                return -1;
            }else if(nums[i]>0){
                ans = nums[i+1]-nums[i];
            }
        }
        if(ans < 0){
            ans = -1 * ans;
        }
        return ans;
    }
}
