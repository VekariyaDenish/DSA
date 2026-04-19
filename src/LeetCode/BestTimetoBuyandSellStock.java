package LeetCode;

//121. Best Time to Buy and Sell Stock

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    static int maxProfit(int[] prices) {
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
