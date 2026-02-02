package Arrays;

//1389. Create Target Array in the Given Order

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArrayinTheGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            list.add(index[i],nums[i]);
//        }
//        int[] array = new int[list.size()];
//        for(int i=0;i<list.size();i++){
//            array[i]=list.get(i);
//        }

//        System.out.println(list);

        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;

    }
}
