class Solution {
    public int maxProfit(int[] prices) {
        int minprice = prices[0];
        int ans = 0;
        for(int x : prices){
            ans = Math.max(ans , x - minprice);
            minprice = Math.min(minprice , x);
        }
        return ans;
    }
}
