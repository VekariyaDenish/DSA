package Arrays;

//1295. Find Numbers with Even Number of Digits

public class FindNumbersWithEvenNumberDigits {
    public static void main(String[] args) {
        int [] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int temp = 0 ;
        int count =0;

        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];
            int b = 0;
            while(temp>0){
                int rem = temp%10;
                b++;
                temp /=10;
            }
                if(b%2==0){
                    count++;
                }
        }
        return count;
    }
}
;