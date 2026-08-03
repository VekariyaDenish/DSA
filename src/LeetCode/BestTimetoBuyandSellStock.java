package LeetCode;

//121. Best Time to Buy and Sell Stock

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int [] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
    static int maxProfit(int[] prices) {
//        int max = 0;
//
//        for (int i = 0; i < prices.length; i++) {
//            for (int j =  i+1;j < prices.length; j++) {
//                int ans = prices[j] - prices[i];
//                if(max < ans) max = ans;
//            }
//        }
//
//        return max;

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // buy here
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // sell here
            }
        }

        return maxProfit;
    }
}
