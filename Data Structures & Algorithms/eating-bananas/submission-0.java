class Solution {
    private long totalHours(int[] piles , int speed){
        long totalH = 0;
        for(int banans : piles){
            totalH += (int)Math.ceil((double)banans/speed);
        }
        return totalH;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int banans:piles){
            high = Math.max(high , banans);
        }
        while(low<=high){
            int mid = (low+ high)/2;
            if(totalHours(piles,mid) <= h){
                high = mid - 1;
            } else {
                low= mid+1;
            }
        }
        return low;
    }
}
