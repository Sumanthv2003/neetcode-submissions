class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, n= prices.length, minprice = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            minprice = Math.min(minprice, prices[i]);
            int sell = prices[i] - minprice;
            maxProfit = Math.max(maxProfit, sell);
        }
        return maxProfit;
    }
}
