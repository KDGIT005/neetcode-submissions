class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int l = 0;
        int r = n-1;
        int ans = 0;
        while(l < r){
            int width = r - l;
            int height = Math.min(heights[l],heights[r]);
            int area = width * height;
            ans = Math.max(ans , area);
            if(heights[l] < heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return ans;
    }
}
