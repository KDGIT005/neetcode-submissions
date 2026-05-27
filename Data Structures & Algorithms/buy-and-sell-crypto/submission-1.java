class Solution {
    public int maxProfit(int[] prices) {
        var buyprice = Integer.MAX_VALUE;
        var maxprofit = 0;
        for(int i =0; i<prices.length; i++){
            if (buyprice < prices[i]) { 
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            }else{
                buyprice = prices[i];
            }
            
        }
        return maxprofit;
    }
}
