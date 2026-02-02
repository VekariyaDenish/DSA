package Arrays;

import java.util.ArrayList;
import java.util.List;

//1431. Kids With the Greatest Number of Candies

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int [] ans = {4,2,1,1,2};
        System.out.println((kidsWithCandies(ans,1)));

    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list =new ArrayList<>();
            int max = candies[1];
        for (int i = 0; i < candies.length; i++) {
            if(max<candies[i]){
                max=candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]+extraCandies>=max){
                list.add(true);
            }else {
                list.add(false);
            }
        }
        return list;
    }
}
