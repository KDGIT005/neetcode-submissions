class Solution {
    private int possible(int[] weights , int days , int capacity){
        int requiredDays = 1;
        int load  =  0;
        for(int w: weights){
            if(load + w > capacity){
                requiredDays++;
                load = w;
            }else  load += w;
        }
        return requiredDays;
    }
    public int shipWithinDays(int[] weights, int days) {
        // Your code goes here
        int low = 0 , high = 0;
        for(int w: weights){
            low =  Math.max(low , w);
            high += w;
        }
        while(low<=high){
            int mid =  (low+high)/2;
            if(possible(weights,days,mid)<=days){
                high = mid - 1;
            }else low = mid+1;
        }
        return low;
    }
}